package view;



import entity.ScorePojo;
import main.CalculateScore;
import main.RandomUtil;
import main.RollTime;
import main.Score;
import rmi.RMIClient;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JPanel panel_1;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JLabel lblNewLabel_10;
	private JCheckBox chckbxNewCheckBox_3;
	private JLabel lblNewLabel_11;
	private JCheckBox chckbxNewCheckBox_4;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JButton btnNewButton_13;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private int[] nums=new int[5];
	private ImageIcon[] img=new ImageIcon[5];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 790);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Player Name:");
		lblNewLabel.setBounds(103, 10, 77, 15);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(191, 7, 189, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Upper Section", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setToolTipText("Upper Section");
		panel.setBounds(59, 35, 319, 311);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnNewButton = new JButton("Aces");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg=CalculateScore.getIntance.selectCategory(0,Integer.parseInt(textField_1.getText()),textField.getText());
				JOptionPane.showMessageDialog(null, msg);
				if(msg.equals("success")){
					btnNewButton.setEnabled(false);
					btnNewButton_13.setEnabled(true);
					RollTime rollTime=RandomUtil.times.get(textField.getText());
					rollTime.setTurn(0);
					rollTime.setRoll(rollTime.getRoll()+1);
					setCheckBox();
				}
			}
		});
		btnNewButton.setBackground(Color.white);
		btnNewButton.setBounds(10, 22, 90, 23);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Twos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg=CalculateScore.getIntance.selectCategory(1,Integer.parseInt(textField_2.getText()),textField.getText());
				JOptionPane.showMessageDialog(null, msg);
				if(msg.equals("success")){
					btnNewButton_1.setEnabled(false);
					btnNewButton_13.setEnabled(true);
					RollTime rollTime=RandomUtil.times.get(textField.getText());
					rollTime.setTurn(0);
					rollTime.setRoll(rollTime.getRoll()+1);
					setCheckBox();
				}
			}
		});
		btnNewButton_1.setBackground(Color.white);
		btnNewButton_1.setBounds(10, 55, 90, 23);
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Threes");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg=CalculateScore.getIntance.selectCategory(2,Integer.parseInt(textField_3.getText()),textField.getText());
				JOptionPane.showMessageDialog(null, msg);
				if(msg.equals("success")){
					btnNewButton_2.setEnabled(false);
					btnNewButton_13.setEnabled(true);
					RollTime rollTime=RandomUtil.times.get(textField.getText());
					rollTime.setTurn(0);
					rollTime.setRoll(rollTime.getRoll()+1);
					setCheckBox();
				}
			}
		});
		btnNewButton_2.setBackground(Color.white);
		btnNewButton_2.setBounds(10, 88, 90, 23);
		panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Fours");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg=CalculateScore.getIntance.selectCategory(3,Integer.parseInt(textField_4.getText()),textField.getText());
				JOptionPane.showMessageDialog(null, msg);
				if(msg.equals("success")){
					btnNewButton_3.setEnabled(false);
					btnNewButton_13.setEnabled(true);
					RollTime rollTime=RandomUtil.times.get(textField.getText());
					rollTime.setTurn(0);
					rollTime.setRoll(rollTime.getRoll()+1);
					setCheckBox();
				}
			}
		});
		btnNewButton_3.setBackground(Color.white);
		btnNewButton_3.setBounds(10, 121, 90, 23);
		panel.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Fives");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg=CalculateScore.getIntance.selectCategory(4,Integer.parseInt(textField_5.getText()),textField.getText());
				JOptionPane.showMessageDialog(null, msg);
				if(msg.equals("success")){
					btnNewButton_4.setEnabled(false);
					btnNewButton_13.setEnabled(true);
					RollTime rollTime=RandomUtil.times.get(textField.getText());
					rollTime.setTurn(0);
					rollTime.setRoll(rollTime.getRoll()+1);
					setCheckBox();
				}
			}
		});
		btnNewButton_4.setBackground(Color.white);
		btnNewButton_4.setBounds(10, 154, 90, 23);
		panel.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("Sixes");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg=CalculateScore.getIntance.selectCategory(5,Integer.parseInt(textField_6.getText()),textField.getText());
				JOptionPane.showMessageDialog(null, msg);
				if(msg.equals("success")){
					btnNewButton_5.setEnabled(false);
					btnNewButton_13.setEnabled(true);
					RollTime rollTime=RandomUtil.times.get(textField.getText());
					rollTime.setTurn(0);
					rollTime.setRoll(rollTime.getRoll()+1);
					setCheckBox();
				}
			}
		});
		btnNewButton_5.setBackground(Color.white);
		btnNewButton_5.setBounds(10, 187, 90, 23);
		panel.add(btnNewButton_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(161, 23, 148, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(162, 56, 147, 21);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(162, 89, 147, 21);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(162, 122, 147, 21);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(162, 155, 147, 21);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(162, 188, 147, 21);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Score Subtotal");
		lblNewLabel_1.setBounds(10, 220, 90, 15);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Bonus");
		lblNewLabel_2.setBounds(10, 247, 58, 15);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Grand Total");
		lblNewLabel_3.setBounds(10, 279, 83, 15);
		panel.add(lblNewLabel_3);
		
		textField_7 = new JTextField();
		textField_7.setBounds(161, 217, 148, 21);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(161, 244, 148, 21);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(161, 276, 148, 21);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		lblNewLabel_4 = new JLabel("New label");
		ImageIcon imgaeIcon=new ImageIcon("img\\die1.png");
		imgaeIcon.setImage((imgaeIcon.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT)));
		lblNewLabel_4.setIcon(imgaeIcon);
		lblNewLabel_4.setBounds(388, 45, 70, 70);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(imgaeIcon);
		lblNewLabel_5.setBounds(388, 150, 70, 70);
		contentPane.add(lblNewLabel_5);
		
		chckbxNewCheckBox = new JCheckBox("keep");
		chckbxNewCheckBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		chckbxNewCheckBox.setBounds(398, 121, 109, 23);
		contentPane.add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("keep");
		chckbxNewCheckBox_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		chckbxNewCheckBox_1.setBounds(398, 226, 109, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(imgaeIcon);
		lblNewLabel_6.setBounds(388, 255, 70, 70);
		contentPane.add(lblNewLabel_6);
		
		chckbxNewCheckBox_2 = new JCheckBox("keep");
		chckbxNewCheckBox_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		chckbxNewCheckBox_2.setBounds(398, 331, 109, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Lower Section", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(59, 356, 319, 366);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		btnNewButton_6 = new JButton("3 of a kind");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg=CalculateScore.getIntance.selectCategory(6,Integer.parseInt(textField_10.getText()),textField.getText());
				JOptionPane.showMessageDialog(null, msg);
				if(msg.equals("success")){
					btnNewButton_6.setEnabled(false);
					btnNewButton_13.setEnabled(true);
					RollTime rollTime=RandomUtil.times.get(textField.getText());
					rollTime.setTurn(0);
					rollTime.setRoll(rollTime.getRoll()+1);
					setCheckBox();
				}
			}
		});
		btnNewButton_6.setBackground(Color.white);
		btnNewButton_6.setBounds(10, 21, 119, 23);
		panel_1.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("4 of a kind");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg=CalculateScore.getIntance.selectCategory(7,Integer.parseInt(textField_11.getText()),textField.getText());
				JOptionPane.showMessageDialog(null, msg);
				if(msg.equals("success")){
					btnNewButton_7.setEnabled(false);
					btnNewButton_13.setEnabled(true);
					RollTime rollTime=RandomUtil.times.get(textField.getText());
					rollTime.setTurn(0);
					rollTime.setRoll(rollTime.getRoll()+1);
					setCheckBox();
				}
			}
		});
		btnNewButton_7.setBackground(Color.white);
		btnNewButton_7.setBounds(10, 54, 119, 23);
		panel_1.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("Full House");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg=CalculateScore.getIntance.selectCategory(8,Integer.parseInt(textField_12.getText()),textField.getText());
				JOptionPane.showMessageDialog(null, msg);
				if(msg.equals("success")){
					btnNewButton_8.setEnabled(false);
					btnNewButton_13.setEnabled(true);
					RollTime rollTime=RandomUtil.times.get(textField.getText());
					rollTime.setTurn(0);
					rollTime.setRoll(rollTime.getRoll()+1);
					setCheckBox();
				}
			}
		});
		btnNewButton_8.setBackground(Color.white);
		btnNewButton_8.setBounds(10, 87, 119, 23);
		panel_1.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("Small Straight");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg=CalculateScore.getIntance.selectCategory(9,Integer.parseInt(textField_13.getText()),textField.getText());
				JOptionPane.showMessageDialog(null, msg);
				if(msg.equals("success")){
					btnNewButton_9.setEnabled(false);
					btnNewButton_13.setEnabled(true);
					RollTime rollTime=RandomUtil.times.get(textField.getText());
					rollTime.setTurn(0);
					rollTime.setRoll(rollTime.getRoll()+1);
					setCheckBox();
				}
			}
		});
		btnNewButton_9.setBackground(Color.white);
		btnNewButton_9.setBounds(10, 120, 123, 23);
		panel_1.add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("Large Straight");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg=CalculateScore.getIntance.selectCategory(10,Integer.parseInt(textField_14.getText()),textField.getText());
				JOptionPane.showMessageDialog(null, msg);
				if(msg.equals("success")){
					btnNewButton_10.setEnabled(false);
					btnNewButton_13.setEnabled(true);
					RollTime rollTime=RandomUtil.times.get(textField.getText());
					rollTime.setTurn(0);
					rollTime.setRoll(rollTime.getRoll()+1);
					setCheckBox();
				}
			}
		});
		btnNewButton_10.setBackground(Color.white);
		btnNewButton_10.setBounds(10, 153, 123, 23);
		panel_1.add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("Yahtzee");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg=CalculateScore.getIntance.selectCategory(11,Integer.parseInt(textField_15.getText()),textField.getText());
				JOptionPane.showMessageDialog(null, msg);
				if(msg.equals("success")){
					btnNewButton_11.setEnabled(false);
					btnNewButton_13.setEnabled(true);
					RollTime rollTime=RandomUtil.times.get(textField.getText());
					rollTime.setTurn(0);
					rollTime.setRoll(rollTime.getRoll()+1);
					setCheckBox();
				}
			}
		});
		btnNewButton_11.setBackground(Color.white);
		btnNewButton_11.setBounds(10, 186, 97, 23);
		panel_1.add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("Chance");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg=CalculateScore.getIntance.selectCategory(12,Integer.parseInt(textField_16.getText()),textField.getText());
				JOptionPane.showMessageDialog(null, msg);
				if(msg.equals("success")){
					btnNewButton_12.setEnabled(false);
					btnNewButton_13.setEnabled(true);
					RollTime rollTime=RandomUtil.times.get(textField.getText());
					rollTime.setTurn(0);
					rollTime.setRoll(rollTime.getRoll()+1);
					setCheckBox();
				}
			}
		});
		btnNewButton_12.setBackground(Color.white);
		btnNewButton_12.setBounds(10, 219, 97, 23);
		panel_1.add(btnNewButton_12);
		
		textField_10 = new JTextField();
		textField_10.setBounds(160, 22, 149, 21);
		panel_1.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(160, 55, 149, 21);
		panel_1.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(160, 88, 149, 21);
		panel_1.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(160, 121, 149, 21);
		panel_1.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(160, 154, 149, 21);
		panel_1.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(160, 187, 149, 21);
		panel_1.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(160, 220, 149, 21);
		panel_1.add(textField_16);
		textField_16.setColumns(10);
		
		lblNewLabel_7 = new JLabel("Yahtzee Bonus");
		lblNewLabel_7.setBounds(10, 262, 119, 15);
		panel_1.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Total of lower section");
		lblNewLabel_8.setBounds(10, 290, 141, 15);
		panel_1.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Grand Total");
		lblNewLabel_9.setBounds(10, 319, 119, 15);
		panel_1.add(lblNewLabel_9);
		
		textField_17 = new JTextField();
		textField_17.setBounds(160, 259, 149, 21);
		panel_1.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(160, 287, 149, 21);
		panel_1.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBounds(160, 316, 149, 21);
		panel_1.add(textField_19);
		textField_19.setColumns(10);
		
		lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(imgaeIcon);
		lblNewLabel_10.setBounds(388, 360, 70, 70);
		contentPane.add(lblNewLabel_10);
		
		chckbxNewCheckBox_3 = new JCheckBox("keep");
		chckbxNewCheckBox_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		chckbxNewCheckBox_3.setBounds(398, 436, 109, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(imgaeIcon);
		lblNewLabel_11.setBounds(388, 465, 70, 70);
		contentPane.add(lblNewLabel_11);
		
		chckbxNewCheckBox_4 = new JCheckBox("keep");
		chckbxNewCheckBox_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		chckbxNewCheckBox_4.setBounds(398, 541, 109, 23);
		contentPane.add(chckbxNewCheckBox_4);
		
		lblNewLabel_12 = new JLabel("Roll");
		lblNewLabel_12.setBounds(388, 603, 31, 15);
		contentPane.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("0");
		lblNewLabel_13.setBounds(430, 603, 64, 15);
		contentPane.add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("Turn");
		lblNewLabel_14.setBounds(388, 639, 31, 15);
		contentPane.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("1");
		lblNewLabel_15.setBounds(430, 639, 64, 15);
		contentPane.add(lblNewLabel_15);
		
		btnNewButton_13 = new JButton("Roll");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				if(username==null||username.equals("")){
					JOptionPane.showMessageDialog(null, "player Name is empty");
					return;
				}
				int[] index=new int[5];
				int n=5;
				if(chckbxNewCheckBox.isSelected()){
					index[0]=1;
					n-=1;
				}
				if(chckbxNewCheckBox_1.isSelected()){
					index[1]=1;
					n-=1;
				}
				if(chckbxNewCheckBox_2.isSelected()){
					index[2]=1;
					n-=1;
				}
				if(chckbxNewCheckBox_3.isSelected()){
					index[3]=1;
					n-=1;
				}
				if(chckbxNewCheckBox_4.isSelected()){
					index[4]=1;
					n-=1;
				}
				if(n==0){
					JOptionPane.showMessageDialog(null, "null dice roll");
					return;
				}
				RollTime rollTime=RandomUtil.times.get(username);
				if(rollTime!=null){
					if(rollTime.getTurn()==3){
						JOptionPane.showMessageDialog(null, "3 time");

						rollTime.setTurn(0);
						RandomUtil.times.put(username,rollTime);
						btnNewButton_13.setEnabled(false);
						return;
					}
				}
				LinkedList<Integer> list= new LinkedList<>(RandomUtil.getRandom(n,username));
				if(list==null||list.size()==0){
					JOptionPane.showMessageDialog(null, "13 rolls");
					return ;
				}
				System.out.println(list.toString());
				for(int i=0;i<index.length;i++){
					if(index[i]==0){
						nums[i]=list.pollFirst();
					}
				}

				List<Integer> paras=new ArrayList<>();
				for(int i=0;i<nums.length;i++){
					paras.add(nums[i]);
					if(index[i]==0){
						img[i]=new ImageIcon("img\\die"+nums[i]+".png");
						img[i].setImage((img[i].getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT)));
					}
				}
				lblNewLabel_4.setIcon(img[0]);
				lblNewLabel_5.setIcon(img[1]);
				lblNewLabel_6.setIcon(img[2]);
				lblNewLabel_10.setIcon(img[3]);
				lblNewLabel_11.setIcon(img[4]);
				Score score= CalculateScore.getIntance.getSore(paras,username);
				setText(score);
				if(rollTime!=null){
					lblNewLabel_13.setText(rollTime.getTurn().toString());
					lblNewLabel_15.setText((rollTime.getRoll()+1)+"");
				}else{
					lblNewLabel_13.setText("1");
					lblNewLabel_15.setText("1");
				}


			}
		});
		btnNewButton_13.setBounds(397, 693, 77, 23);
		contentPane.add(btnNewButton_13);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 50, 23);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Game");
		menuBar.add(mnNewMenu);
		JMenuItem mntmNewMenuItem = new JMenuItem("Load Game");
		
		mntmNewMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 String userName=textField.getText().trim();
                 if(userName.isEmpty()) {
              	   JOptionPane.showMessageDialog(null, "Please enter username");
              	   return;
                 }else {
              	   loadGame(userName);
                 }
            }
        });
		
		mnNewMenu.add(mntmNewMenuItem);
		mntmNewMenuItem_1 = new JMenuItem("Save Game");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 String userName=textField.getText().trim();
                 if(userName.isEmpty()) {
              	   JOptionPane.showMessageDialog(null, "Please enter username");
              	   return;
                 }else {
              	   long result= saveGame(userName);
              	   if(result>0) {
              		 JOptionPane.showMessageDialog(null, "Save successfully");
              	   }else {
              		 JOptionPane.showMessageDialog(null, "Save failure");
              	   }
                 }
            }
        });
		mnNewMenu.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Exit");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	MainFrame.this.dispose();
            }
        });
		mnNewMenu.add(mntmNewMenuItem_2);

	}
	
	
	void loadGame(String userName) {
		try {
			ScorePojo scorePojo=RMIClient.getScoreInterface().getByName(userName);
			if(scorePojo!=null) {
				textField_1.setText(scorePojo.getAces());
				textField_2.setText(scorePojo.getTwos());
				textField_3.setText(scorePojo.getThrees());
				textField_4.setText(scorePojo.getFours());
				textField_5.setText(scorePojo.getFives());
				
				textField_6.setText(scorePojo.getSixes());
				textField_7.setText(scorePojo.getUpperTotal());
				textField_8.setText(scorePojo.getUpperBonus());
				textField_9.setText(scorePojo.getUpperGrantTotal());
				textField_10.setText(scorePojo.getThreeOfKind());
				
				textField_11.setText(scorePojo.getFourOfKind());
				textField_12.setText(scorePojo.getFullHouse());
				textField_13.setText(scorePojo.getSmallStraight());
				textField_14.setText(scorePojo.getLargeStraight());
				textField_15.setText(scorePojo.getYahtzee());
				
				textField_16.setText(scorePojo.getYahtzeeBonus());
				textField_17.setText(scorePojo.getLowerTotal());
				textField_18.setText(scorePojo.getLowerBonus());
				textField_19.setText(scorePojo.getLowerGrantTotal());
				lblNewLabel_13.setText(scorePojo.getTurn());
				//System.out.println(scorePojo.getTurn());
				lblNewLabel_15.setText(scorePojo.getRoll());
				System.out.println(scorePojo.getRoll());
				
			}else {
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				lblNewLabel_13.setText("");
				lblNewLabel_15.setText("");
			}
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	long saveGame(String userName) {
		long result=0;
		try {
			ScorePojo scorePojo=new ScorePojo();
			scorePojo.setUsername(userName);
			scorePojo.setAces(textField_1.getText().trim());
			scorePojo.setTwos(textField_2.getText().trim());
			scorePojo.setThrees(textField_3.getText().trim());
			scorePojo.setFours(textField_4.getText().trim());
			scorePojo.setFives(textField_5.getText().trim());
			
			scorePojo.setSixes(textField_6.getText().trim());
			scorePojo.setUpperTotal(textField_7.getText().trim());
			scorePojo.setUpperBonus(textField_8.getText().trim());
			scorePojo.setUpperGrantTotal(textField_9.getText().trim());
			scorePojo.setThreeOfKind(textField_10.getText().trim());
			
			scorePojo.setFourOfKind(textField_11.getText().trim());
			scorePojo.setFullHouse(textField_12.getText().trim());
			scorePojo.setSmallStraight(textField_13.getText().trim());
			scorePojo.setLargeStraight(textField_14.getText().trim());
			scorePojo.setYahtzee(textField_15.getText().trim());
			scorePojo.setYahtzeeBonus(textField_16.getText().trim());
			scorePojo.setLowerTotal(textField_17.getText().trim());
			scorePojo.setLowerBonus(textField_18.getText().trim());
			scorePojo.setLowerGrantTotal(textField_19.getText().trim());
			scorePojo.setTurn(lblNewLabel_13.getText().trim());
			scorePojo.setRoll(lblNewLabel_15.getText().trim());
			
			result= RMIClient.getScoreInterface().saveOne(scorePojo);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result=0;
		}
		
		return result;
	}
	
	private void setText(Score score){
		textField_1.setText(score.getAces().toString());
		textField_2.setText(score.getTwos().toString());
		textField_3.setText(score.getThrees().toString());
		textField_4.setText(score.getFours().toString());
		textField_5.setText(score.getFives().toString());
		textField_6.setText(score.getSixes().toString());
		textField_7.setText(score.getUpperTotal().toString());
		textField_8.setText(score.getUpperBonus().toString());
		textField_9.setText(score.getUpperGrantTotal().toString());
		textField_10.setText(score.getThreeOfKind().toString());
		textField_11.setText(score.getFourOfKind().toString());
		textField_12.setText(score.getFullHouse().toString());
		textField_13.setText(score.getSmallStraight().toString());
		textField_14.setText(score.getLargeStraight().toString());
		textField_15.setText(score.getYahtzee().toString());
		textField_16.setText(score.getChance().toString());
		textField_17.setText(score.getLowerBonus().toString());
		textField_18.setText(score.getLowerTotal().toString());
		textField_19.setText(score.getLowerGrantTotal().toString());
	}

	private void setCheckBox(){
		chckbxNewCheckBox.setSelected(false);
		chckbxNewCheckBox_1.setSelected(false);
		chckbxNewCheckBox_2.setSelected(false);
		chckbxNewCheckBox_3.setSelected(false);
		chckbxNewCheckBox_4.setSelected(false);


	}
	
}
