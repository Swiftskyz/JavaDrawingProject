package drawing.view;

import java.awt.Color;

import javax.swing.JPanel;
import drawing.controller.DrawingController;

public class DrawingAppPanel
{
	private DrawingController app;
	
	public DrawingAppPanel(DrawingController app)
	{
		private DrawingController app;
		private ArtPanel canvas;
		private JPanel colorPanel;
		private JPanel menuPanel;
		private JScrollPane canvasPane;
		private SpringLayout appLayout;
		private JSlider widthSlider;
		private JButton redButton;
		private JButton greenButton;
		private JButton blueButton;
		private JButton whiteButton;
		private JButton blackButton;
		private JButton purpleButton;
		private JButton orangeButton;
		private JButton yellowButton;
		private JButton saveButton;
		private JButton loadButton;
		private JButton clearButton;
		
		private final int MINUMUM_LINE = 1;
		private final int MINUMUM_LINE = 25;
		
		super();
		this.app = app;
		this.canvas = new ArtPanel(app);
		canvasPane = new JScrollPane();
		appLayout = new SpringLayout();
		
		greenButton = new JButton("green");
		redButton = new JButton("red");
		blueButton = new JButton("blue");
		blackButton = new JButton("black");
		whiteButton = new JButton("white");
		purpleButton = new JButton("purple");
		orangeButton = new JButton("orange");
		yellowButton = new JButton("yellow");
		
		saveButton = new JButton("save new panel");
		loadButton = new JButton("load new panel");
		clearButton = new JButton("clear panel");
		widthSlider = new JSlider(MINIMUM LINE, MAXIMUM_LINE);
		colorPanel = new JPanel(new GridLayout(0, 1));
		menuPanel = new JPanel(new GridLayout(0, 1));
		
		setupMenuPanels();
		setupSlider();
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupSlider()
	{
		Hashtable<Integer, JLabel> scaleLabels = new Hashtable<Integer, JLabel>();
		scaleLabels.put(MINIMUM_LINE, new JLabel("<HTML>Small<BR>Line</HTML>"));
		scaleLabels.put(MAXIMUM_LINE, new JLabel("<HTML>Large<BR>Line</HTML>"));
		widthSlider.setLabelTable(scaleLabels);
		widthSlider.setSnapToTicks(true);
		widthSlider.setMajorTickSpacing(5);
		widthSlider.setMinorTickSpacing(1);
		widthSlider.setPaintTicks(true);
		widthSlider.setPaintLabels(true);
		widthSlider.setValue((MAXIMUM_LINE + MINIMUM_LINE) / 2);
	}
	
	private void setupMenuPanels()
	{
		colorPanel.setPreferredSize(new Dimension(50, 700));
		menuPanel.setPreferredSize(new Dimension(50, 700));
		
		purpleButton.setForeground(new Color(75, 0, 130));
		blueButton.setForeground(Color.BLUE);
		greenButton.setForeground(Color.GREEN);
		orangeButton.setForeground(Color.ORANGE);
		redButton.setForeground(Color.RED);
		yellowButton.setForeground(Color.YELLOW);
		
		colorPanel.add(blackButton);
		colorPanel.add(purpleButton);
		colorPanel.add(blueButton);
		colorPanel.add(greenButton);
		colorPanel.add(yellowButton);
		colorPanel.add(orangeButton);
		colorPanel.add(redButton);
		colorPanel.add(whiteButton);
		
		menuPanel.add(widthSlider);
		menuPanel.add(loadButton);
		menuPanel.add(saveButton);
		menuPanel.add(clearButton);
	}
	
	private void setupScrollPane()
	{
		
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		appLayout.putContraint(SpringLayout.NORTH, colorPanel, 0, SpringLayout.NORTH, canvasPane);
		appLayout.putContraint(SpringLayout.SOUTH, colorPanel, 0, SpringLayout.SOUTH, canvasPane);
		appLayout.putContraint(SpringLayout.WEST, colorPanel, 50, SpringLayout.WEST, canvasPane);
		appLayout.putContraint(SpringLayout.EAST, colorPanel, 0, SpringLayout.EAST, menuPane);
		
		appLayout.putContraint(SpringLayout.WEST, menuPanel, 200, SpringLayout.EAST, canvasPane);
		appLayout.putContraint(SpringLayout.SOUTH, menuPanel, 0, SpringLayout.SOUTH, canvasPane);
		appLayout.putContraint(SpringLayout.EAST, menuPanel, -50, SpringLayout.EAST, this);
		appLayout.putContraint(SpringLayout.NORTH, menuPanel, 0, SpringLayout.NORTH, canvasPane);
		
		appLayout.putContraint(SpringLayout.NORTH, canvasPane, 25, SpringLayout.NORTH, this);
		appLayout.putContraint(SpringLayout.WEST, canvasPane, 50, SpringLayout.WEST, this);
		appLayout.putContraint(SpringLayout.SOUTH, canvasPane, -50, SpringLayout.SOUTH, this);
	}
	
	private void setupListeners()
	{
		canvas.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent e)
			
			public void mousePressed(MouseEvent e)
			
			public void mouseReleased(MouseEvent e)
			
			public void mouseEntered(MouseEvent e)
			
			public void mouseExited(MouseEvent e)
			
		});
		
		canvas.addMouseMotionalListener(new MouseMotionListener()
		{
			
			public void mouseDragged(MouseEvent e)
			
			public void mouseMoved(MouseEvent e)
		});
		
		saveButton.addActionListeners
	}

}
