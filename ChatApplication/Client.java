import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Client extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    Socket socket;

    BufferedReader bReader;
    PrintWriter pWriter;

    private JLabel heading = new JLabel("Client");
    private JTextArea messageArea = new JTextArea();
    private JTextField messageInput = new JTextField();
    private Font font = new Font("Roboto", Font.PLAIN, 20);

    public Client() {
        try {

            System.out.println("sending request to server");
            socket = new Socket("192.168.43.141", 8877);
            System.out.println("connection done");

            bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            pWriter = new PrintWriter(socket.getOutputStream());

            createGUI();
            handleEvents();
            startReading();
            // startWriting();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    private void handleEvents() {
        messageInput.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                if (e.getKeyCode() == 10) {
                    String contentToSend = messageInput.getText();
                    messageArea.append("Me : " + contentToSend + "\n");
                    pWriter.println(contentToSend);
                    pWriter.flush();
                    messageInput.setText("");
                    messageInput.requestFocus();

                }

            }

        });
    }

    private void createGUI() {
        this.setTitle("Client Messenger");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        heading.setFont(font);
        messageArea.setFont(font);
        messageInput.setFont(font);
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        messageArea.setEditable(false);
        messageArea.setCaretPosition(messageArea.getDocument().getLength());
        ;

        this.setLayout(new BorderLayout());
        this.add(heading, BorderLayout.NORTH);
        JScrollPane jScrollPane = new JScrollPane(messageArea);
        this.add(jScrollPane, BorderLayout.CENTER);
        this.add(messageInput, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void startReading() {

        // thread read karke deta rahega
        Runnable r1 = () -> {
            System.out.println("reader started...");
            try {
                while (true) {

                    String msg;
                    msg = bReader.readLine();
                    if (msg.equals("exit")) {
                        System.out.println("server terminated the chat");
                        JOptionPane.showMessageDialog(this, "Server terminated the chat");
                        messageInput.setEnabled(false);
                        socket.close();
                        break;
                    }
                    // System.out.println("Server: " + msg);
                    messageArea.append("Server : " + msg + "\n");
                }
            } catch (Exception e) {
                System.out.println("connection closed");
            }

        };
        new Thread(r1).start();

    }

    public void startWriting() {

        // thread data user lega and then send karega client tak
        Runnable r2 = () -> {
            System.out.println("writer started...");
            try {
                while (!socket.isClosed()) {

                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    String content = br.readLine();
                    pWriter.println(content);
                    pWriter.flush();

                    if (content.equals("exit")) {
                        socket.close();
                        break;
                    }
                }
            } catch (Exception e) {

                System.out.println("connection closed");
                // e.printStackTrace();
            }

        };
        new Thread(r2).start();
    }

    public static void main(String[] args) {
        System.out.println("this is client");
        new Client();
    }

}
