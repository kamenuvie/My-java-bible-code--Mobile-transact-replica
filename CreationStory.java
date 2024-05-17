import javax.swing.*;

 class CreationStoryGUI {
    private static JTextArea textArea;

    public static void main(String[] args) {
        // Create a JFrame to hold the GUI components
        JFrame frame = new JFrame("Creation Story");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JTextArea to display the story
        textArea = new JTextArea();
        textArea.setEditable(false);

        // Create a JScrollPane to enable scrolling in the text area
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.getContentPane().add(scrollPane);

        // Create a JButton for user interaction
        JButton startButton = new JButton("Start");
        startButton.addActionListener(e -> displayStory());

        // Add the button to the frame
        frame.getContentPane().add(startButton, "South");

        // Set the visibility of the frame
        frame.setVisible(true);
    }

    private static void displayStory() {
        // Clear the text area
        textArea.setText("");

        // Display the creation story in the JTextArea
        textArea.append("The creation story according Genesis as recorded began this way:\n\n");

        String reply1 = JOptionPane.showInputDialog(null, "Do you want to know what happened on the first day? (Y/N)");
        if (reply1 != null && reply1.equalsIgnoreCase("y")) {
            textArea.append("In Genesis 1:1-3: God created the Heavens and Earth and the earth was without\n" +
                    "form and void, and darkness was upon the surface of the deep.\n" +
                    "And God said, 'Let there be light,' and there was light.\n\n");
        } else {
            JOptionPane.showMessageDialog(null, "Well, that's fine.");
        }

        int option = JOptionPane.showConfirmDialog(null, "Can we continue?");
        if (option == JOptionPane.YES_OPTION) {
            textArea.append("So God made the firmament (sky) and divided the waters which were\n" +
                    "under the firmament from the waters which were above the firmament:\n" +
                    "and it was so. And the evening and the morning were the second day.\n" +
                    "Ref. [Genesis 1:7-8]\n\n");
        } else {
            JOptionPane.showMessageDialog(null,"Oh really!!");
        }

        String reply3 = JOptionPane.showInputDialog(null,
                "* What do you think happened on the third day?\n" +
                        "A. God gathered the waters and created dry lands which he commanded to brought forth plants Ref.[Genesis 1:9-13]\n" +
                        "B. God created cars.  Ref.[Genesis 1:9-13]\n" +
                        "C. God cooked indomie for Adam and Eve. Ref.[Genesis 1:9-13]\n");
        if (reply3 != null && reply3.equalsIgnoreCase("A")) {
            textArea.append("You are right.\n\n");
        } else if (reply3 != null && reply3.equalsIgnoreCase("B")) {
            textArea.append("No, not right!!\n\n");
        } else {
            textArea.append("Nope, go find out.\n\n");
        }

        JOptionPane.showInputDialog(null, "* DAY 4: Enter 4 to find out what exactly happened:");
        textArea.append("So after God had created the dry grounds, He then with his mighty powers commanded\n" +
                "and the sun, moon, and stars came into being. And this happened on the fourth day Ref.[Genesis 1:14-20]\n\n");

        JOptionPane.showInputDialog(null, "* DAY 5: What happened on that day and where can we reference from the Bible: Press 5:");
        textArea.append("God created birds, flies, fish, and other living creatures\n" +
                "that move in the waters Ref.[Genesis 1:20-22]\n\n");

        JOptionPane.showInputDialog(null, "* DAY 6: What happened on that day and where can we reference from the Bible: Press 6:");
        textArea.append("And on the 6th day, God created man in His own likeness\n" +
                "to take dominion over the things of the universe Ref.[Genesis 1:26-27]\n\n");

        JOptionPane.showInputDialog(null, "* DAY 7: And what happened on this day too? Press 7:");
        textArea.append("And on the 7th day, which happened to be the last day according to the narrative\n" +
                "of creation, God rested from all His work and sanctified and made it Holy.\n" +
                "Ref.[Genesis 2:2-3]\n\n");

        JOptionPane.showMessageDialog(null, "Wow!! What an interesting story!\n\nEnd of the story!");
;
    }
}