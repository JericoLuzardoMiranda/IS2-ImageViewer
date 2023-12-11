package software.ulpgc.ImageViewer.view;

import software.ulpgc.ImageViewer.presenter.Command;
import software.ulpgc.ImageViewer.presenter.ImageDisplay;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class MainFrame extends JFrame {
    private ImageDisplay imageDisplay;
    private final Map<String, Command> commands;

    public MainFrame() {
        this.commands = new HashMap<>();
        setTitle("Image Viewer");
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        add(createImageDisplay());
        add(createToolbar(), BorderLayout.SOUTH);
    }

    private Component createToolbar() {
        JPanel panel = new JPanel();
        panel.add(createArrowButton("◄"));
        panel.add(createArrowButton("►"));
        return panel;
    }

    private Component createArrowButton(String label) {
        JButton button = new JButton(label);
        button.setFont(new Font("Arial", Font.PLAIN, 18));
        button.addActionListener(e -> {
            if ("◄".equals(label)) { commands.get("<").execute(); }
            else if ("►".equals(label)) { commands.get(">").execute(); }
        });
        return button;
    }

    private Component createImageDisplay() {
        SwingImageDisplay display = new SwingImageDisplay();
        this.imageDisplay = display;
        return display;
    }

    public ImageDisplay imageDisplay() {
        return imageDisplay;
    }

    public void add(String name, Command command) {
        commands.put(name, command);
    }
}
