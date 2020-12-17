import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SearchPage extends JFrame{
	private static final int FRAME_WIDTH = 380;
	private static final int FRAME_HEIGHT = 180;
	private static final int FIELD_WIDTH = 10;
	private JTextField inputField;
	private JButton searchBtn;
	private JLabel label;
	public JPanel createLabel() {
		label = new JLabel("開箱資訊搜尋");
		JPanel panel = new JPanel();
		panel.add(label);
		return panel;
	}
	public JPanel createSearchPanel() {
		inputField = new JTextField(FIELD_WIDTH);
		searchBtn = new JButton("Search");
		class SearchListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new ResultsPage();
				frame.setVisible(true);
			}
		}
		ActionListener listener = new SearchListener();
		searchBtn.addActionListener(listener);
		JPanel panel = new JPanel();
		panel.add(inputField);
		panel.add(searchBtn);
		return panel;
	}
	public SearchPage() {
		setTitle("Search Page");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		createPanel();
	}
	public void createPanel() {
		add(createLabel(), BorderLayout.NORTH);
		add(createSearchPanel(), BorderLayout.CENTER);
	}
}
