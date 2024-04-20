package application;

import java.io.File;

import java.awt.event.*;


import java.io.FileNotFoundException;
import java.util.stream.IntStream;

import javax.swing.JButton;

import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class Main extends Application {
	File file;
	LedCircuit led = new LedCircuit(6, 0);

	@Override

	public void start(Stage primaryStage) {
		Pane pan = new Pane();// interface
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setContent(pan);

//////////////////////////////////////////////////////////////////////////text	title	
		Text tx = new Text("LED Lighting ");
		tx.setTabSize(200);
		tx.setLayoutX(340);
		tx.setLayoutY(20);

/////////////////////////////////////////////////////////////img1 led color
		VBox vb3 = new VBox(20);
		Circle st1 = new Circle(15);
		st1.setFill(Color.WHITE);
		Circle st2 = new Circle(15);
		st2.setFill(Color.WHITE);
		Circle st3 = new Circle(15);
		st3.setFill(Color.WHITE);
		Circle st4 = new Circle(15);
		st4.setFill(Color.WHITE);
		Circle st5 = new Circle(15);
		st5.setFill(Color.WHITE);
		Circle st6 = new Circle(15);
		st6.setFill(Color.WHITE);
		vb3.getChildren().addAll(st1, st2, st3, st4, st5, st6);
		vb3.setLayoutX(60);
		vb3.setLayoutY(155);
		vb3.setMaxHeight(350);
		vb3.setMaxWidth(100);
//st.setFill(Color.RED);
///////////////////////////////////////////////////////////table text and TextArea for table
		Text txttable = new Text("Table");

		TextArea ta = new TextArea();
		//ScrollPane scrollPane = new ScrollPane(ta);
		txttable.setLayoutX(50);
		txttable.setLayoutY(500);
		ta.setLayoutX(50);
		ta.setLayoutY(510);
///////////////////////////////////////////////////line
		Line lin1 = new Line();
		Line lin2 = new Line();
		Line lin3 = new Line();
		Line lin4 = new Line();
		Line lin5 = new Line();
		Line lin6 = new Line();

///////////////////////////////////////////////////////////////////////////power image		
		Image img2 = new Image("power.png");
		ImageView imgV2 = new ImageView(img2);

/////////////////////////////////////////////////img2 button (power)
		VBox vb = new VBox(23.70);
		vb.setVisible(false);
		
		
		
////////////////////////////////////////////////////////starts buttons action
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		Button btn3 = new Button("3");
		Button btn4 = new Button("4");
		Button btn5 = new Button("5");
		Button btn6 = new Button("6");
		// arr2[0]=btn1.getText();
		btn1.setOnAction(e -> {

			Scanner scan;
			try {
				scan = new Scanner(file);
				led.numbeOfLED = scan.nextInt();

				while (scan.hasNextLine()) {
					String string = scan.nextLine().trim();
					if (string.isEmpty()) {
						continue;
					}
					String[] stt = string.split(" ");
					int[] light = new int[led.numbeOfLED];
					for (int i = 0; i < led.numbeOfLED; i++) {
//			            	if(light[i]!=1) {
//			            		 ta.setText("the"+ light[i]+"is turn of");
//				               }
						if (!stt[i].isEmpty()) {
							light[i] = Integer.parseInt(stt[i]);

							if (light[i] == 1) {
								st6.setFill(Color.YELLOW);
								ta.setText("Number of LEDs:" + led.numbeOfLED + "\n" + "you turn led" + light[i]
										+ " sucsess" + "\n");
								
								lin1.setStartX(460);
								lin1.setStartY(167);
								lin1.setEndX(320);
								lin1.setEndY(416);
								lin1.setStroke(Color.RED);
//								btn2.setDisable(true);
//								btn3.setDisable(true);
//								btn4.setDisable(true);
//								btn5.setDisable(true);
//								btn6.setDisable(true);
//				            		for(int r=0 ; r<arr1.length;r++) {
//				            		for(int j=0; j<arr2.length; j++) {
//				            			if(arr1[r]==arr2[j]) {
//				            				
//				            				
//				            			}
//				            		}
//				            		
//				            	}

							}

						}

					}

				}
				scan.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		});

///////////////////////////////////////////////////////////////////////////////////////////		
		
		btn2.setOnAction(w -> {

			Scanner scan;
			try {
				scan = new Scanner(file);
				led.numbeOfLED = scan.nextInt();

				while (scan.hasNextLine()) {
					String string = scan.nextLine().trim();
					if (string.isEmpty()) {
						continue;
					}
					String[] stt = string.split(" ");
					int[] light = new int[led.numbeOfLED];
					for (int i = 0; i < led.numbeOfLED; i++) {
			            	
						if (!stt[i].isEmpty()) {
							light[i] = Integer.parseInt(stt[i]);

							if (light[i] == 2) {
								st1.setFill(Color.YELLOW);
								ta.setText("Number of LEDs:" + led.numbeOfLED + "\n" + "you turn led" + light[i]+ " sucsess" + "\n");
								lin2.setStartX(460);
								lin2.setStartY(220);
								lin2.setEndX(320);
								lin2.setEndY(165);
								lin2.setStroke(Color.RED);								
								
							}
							if(light[i]!=2) {
			            		 ta.setText("the"+ light[i]+"is turn of"+"\n");
				               }

						}
						
					}

				}
				scan.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		});
		
		btn3.setOnAction(e->{
			Scanner scan;
			try {
				scan = new Scanner(file);
				led.numbeOfLED = scan.nextInt();

				while (scan.hasNextLine()) {
					String string = scan.nextLine().trim();
					if (string.isEmpty()) {
						continue;
					}
					String[] stt = string.split(" ");
					int[] light = new int[led.numbeOfLED];
					for (int i = 0; i < led.numbeOfLED; i++) {
			            	
						if (!stt[i].isEmpty()) {
							light[i] = Integer.parseInt(stt[i]);

							if (light[i] == 3) {
								st3.setFill(Color.YELLOW);
								ta.setText("Number of LEDs:" + led.numbeOfLED + "\n" + "you turn led" + light[i]+ " sucsess" + "\n");
								lin3.setStartX(460);
								lin3.setStartY(265);
								lin3.setEndX(320);
								lin3.setEndY(263);
								lin3.setStroke(Color.RED);
								
								
								
								
							}
							if(light[i]!=3) {
			            		 ta.setText("the"+ light[i]+"is turn of"+"\n");
				               }

						}

					}

				}
				scan.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
////////////////////////////////////////////////////////////////////////////////////////////
		
		btn4.setOnAction(e->{
			Scanner scan;
			try {
				scan = new Scanner(file);
				led.numbeOfLED = scan.nextInt();

				while (scan.hasNextLine()) {
					String string = scan.nextLine().trim();
					if (string.isEmpty()) {
						continue;
					}
					String[] stt = string.split(" ");
					int[] light = new int[led.numbeOfLED];
					for (int i = 0; i < led.numbeOfLED; i++) {
			            	
						if (!stt[i].isEmpty()) {
							light[i] = Integer.parseInt(stt[i]);

							if (light[i] == 4) {
								st5.setFill(Color.YELLOW);
								ta.setText("Number of LEDs:" + led.numbeOfLED + "\n" + "you turn led" + light[i]+ " sucsess" + "\n");

								lin4.setStartX(460);
								lin4.setStartY(315);
								lin4.setEndX(320);
								lin4.setEndY(358);
								lin4.setStroke(Color.RED);
								
								
								
								
								
								
							}
							if(light[i]!=4) {
			            		 ta.setText("the"+ light[i]+"is turn of"+"\n");
				               }

						}

					}

				}
				scan.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
///////////////////////////////////////////////////////////////////////////////////////////
		
		btn5.setOnAction(e->{
			Scanner scan;
			try {
				scan = new Scanner(file);
				led.numbeOfLED = scan.nextInt();

				while (scan.hasNextLine()) {
					String string = scan.nextLine().trim();
					if (string.isEmpty()) {
						continue;
					}
					String[] stt = string.split(" ");
					int[] light = new int[led.numbeOfLED];
					for (int i = 0; i < led.numbeOfLED; i++) {
			            	
						if (!stt[i].isEmpty()) {
							light[i] = Integer.parseInt(stt[i]);

							if (light[i] == 5) {
								st4.setFill(Color.YELLOW);
								ta.setText("Number of LEDs:" + led.numbeOfLED + "\n" + "you turn led" + light[i]+ " sucsess" + "\n");
								lin5.setStartX(460);
								lin5.setStartY(358);
								lin5.setEndX(320);
								lin5.setEndY(322);
								lin5.setStroke(Color.RED);
								
								if(light[i]!=5) {
				            		 ta.setText("the"+ light[i]+"is turn of"+"\n");
					               }

							}
								
							}
							

					}

				}
				scan.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
////////////////////////////////////////////////////////////////////////////////////////
		
		btn6.setOnAction(e->{
			Scanner scan;
			try {
				scan = new Scanner(file);
				led.numbeOfLED = scan.nextInt();

				while (scan.hasNextLine()) {
					String string = scan.nextLine().trim();
					if (string.isEmpty()) {
						continue;
					}
					String[] stt = string.split(" ");
					int[] light = new int[led.numbeOfLED];
					int[] light2 = new int[led.numbeOfLED];
					
					for (int i = 0; i < led.numbeOfLED; i++) {
			            	
						if (!stt[i].isEmpty()) {
							light[i] = Integer.parseInt(stt[i]);

							if (light[i] == 6) {
								st2.setFill(Color.YELLOW);
								ta.setText("Number of LEDs:" + led.numbeOfLED + "\n" + "you turn led" + light[i]+ " sucsess" + "\n");
								lin6.setStartX(460);
								lin6.setStartY(415);
								lin6.setEndX(318);
								lin6.setEndY(215);
								lin6.setStroke(Color.RED);
							}
							if(light[i]!=6) {
			            		 ta.setText("the"+ light[i]+"is turn of"+"\n");
				               }

						}

					}
					//LedAccess(light2, light, btn6);
				}
			
				scan.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
///////////////////////////////////////////////////////////////////////////////		
		
		vb.getChildren().addAll(btn1, btn2, btn3, btn4, btn5, btn6);
		vb.setLayoutX(460);
		vb.setLayoutY(157);
		vb.setMaxHeight(350);
		vb.setMaxWidth(100);
		imgV2.setLayoutX(450);
		imgV2.setLayoutY(120);
		imgV2.setFitHeight(350);
		imgV2.setFitWidth(300);
///////////////////////////////////////////////////////////////
/////////////////////////////////////////////////Text Message file chooser

		Text txt = new Text("you dosent choose any fil , please choose your file!");
		txt.setLayoutX(200);
		txt.setLayoutY(70);
////////////////////////////////////////////////////////file chooser
		Button chosser = new Button("Choose File");
		chosser.setLayoutX(570);
		chosser.setLayoutY(70);

		chosser.setOnAction(e -> {
			vb.setVisible(true);
			FileChooser fileChooser = new FileChooser();// to choose file
			file = fileChooser.showOpenDialog(primaryStage);
			vb.setVisible(true);
			if (file != null) {
				Scanner scan;
				try {
					scan = new Scanner(file);

					while (scan.hasNextLine()) {
						String string = scan.nextLine();
						String[] stt = string.split(" ");

					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			} else {

				pan.getChildren().add(txt);
			}

		});
///////////////////////////////////////////////////////////////////////	Button reset and find max
		VBox vbb= new VBox(20);
		Button btnreset = new Button("Reset");
		Button btnMax = new Button(" Max Light");
		vbb.getChildren().addAll(btnreset,btnMax);
		vbb.setLayoutX(600);
		vbb.setLayoutY(500);
		
		
		btnMax.setOnAction(e->{
			Scanner scan;
			try {
				scan = new Scanner(file);
				led.numbeOfLED = scan.nextInt();
				int[] light = new int[led.numbeOfLED];
				while (scan.hasNextLine()) {
					String string = scan.nextLine().trim();
					if (string.isEmpty()) {
						continue;
					}
					String[] stt = string.split(" ");
					
					for (int i = 0; i < led.numbeOfLED; i++) {
			            	
						if (!stt[i].isEmpty()) {
							light[i] = Integer.parseInt(stt[i]);

							

					}

				}
					
					 int[] sources = new int[led.numbeOfLED];
			            for (int i = 0; i < led.numbeOfLED; i++) {
			                sources[i] = i + 1;
			            }

			            int[][] dp = new int[led.numbeOfLED + 1][led.numbeOfLED + 1];

			            for (int i = 1; i <= led.numbeOfLED; i++) {
			                for (int j = 1; j <= led.numbeOfLED; j++) {
			                    if (light[i - 1] == sources[j - 1]) {
			                        dp[i][j] = dp[i - 1][j - 1] + 1;
			                    } else {
			                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			                    }
			                }
			            }

			            // Output the maximum number of LEDs connected
			            int maxLEDs = dp[led.numbeOfLED][led.numbeOfLED];
			          
                         
			            // Backtrack to find which LEDs are connected
			            List<Integer> connectedLEDs = new ArrayList<>();
			            int i = led.numbeOfLED, j = led.numbeOfLED;
			            while (i > 0 && j > 0) {
			                if (light[i - 1] == sources[j - 1]) {
			                    connectedLEDs.add(light[i - 1]);
			                    i--;
			                    j--;
			                } else if (dp[i - 1][j] > dp[i][j - 1]) {
			                    i--;
			                } else {
			                    j--;
			                }
			            }

			           
			           
			            ta.appendText("Maximum number of LEDs that can be lit: " + maxLEDs+"\n"+"LEDs connected:"
			            +"\n");
			            Collections.reverse(connectedLEDs);
			            for (int led1 = 0; led1 < connectedLEDs.size(); led1++) {
			             ta.appendText(connectedLEDs.get(led1) + " ");
//			                ||btn2.equals(connectedLEDs.get(led))
//	                		||btn3.equals(connectedLEDs.get(led))||btn4.equals(connectedLEDs.get(led))
//	                		||btn5.equals(connectedLEDs.get(led))||btn6.equals(connectedLEDs.get(led))btn1.equals(connectedLEDs.get(led))||btn2.equals(connectedLEDs.get(led))
//	                		||btn3.equals(connectedLEDs.get(led))||btn4.equals(connectedLEDs.get(led))
//	                		||btn5.equals(connectedLEDs.get(led))||btn6.equals(connectedLEDs.get(led))
			               // Button button = new Button();
			            
			                	if(btn1.getText().equals(connectedLEDs.get(led1))) {
			                		st6.setFill(Color.YELLOW);
									lin1.setStartX(460);
									lin1.setStartY(167);
									lin1.setEndX(320);
									lin1.setEndY(416);
									lin1.setStroke(Color.RED);
			                	}if(btn2.getText().equals(connectedLEDs.get(led1))) {
			                		st1.setFill(Color.YELLOW);
									lin2.setStartX(460);
									lin2.setStartY(220);
									lin2.setEndX(320);
									lin2.setEndY(165);
									lin2.setStroke(Color.RED);	
			                	}if(btn3.getText().equals(connectedLEDs.get(led1))) {
			                		st3.setFill(Color.YELLOW);
									lin3.setStartX(460);
									lin3.setStartY(265);
									lin3.setEndX(320);
									lin3.setEndY(263);
									lin3.setStroke(Color.RED);
			                	}if(btn4.getText().equals(connectedLEDs.get(led1))) {
			                		st5.setFill(Color.YELLOW);
									lin4.setStartX(460);
									lin4.setStartY(315);
									lin4.setEndX(320);
									lin4.setEndY(358);
									lin4.setStroke(Color.RED);
			                	}if(btn5.getText().equals(connectedLEDs.get(led1))) {
			                		st4.setFill(Color.YELLOW);
									lin5.setStartX(460);
									lin5.setStartY(358);
									lin5.setEndX(320);
									lin5.setEndY(322);
									lin5.setStroke(Color.RED);
			                	}if(btn6.getText().equals(connectedLEDs.get(led1))) {
			                		st2.setFill(Color.YELLOW);
									lin6.setStartX(460);
									lin6.setStartY(415);
									lin6.setEndX(318);
									lin6.setEndY(215);
									lin6.setStroke(Color.RED);
			                	}
			                	
			                }
			            
			            System.out.print("\n");
			            DPTable(dp,ta);

			      	
//					int MaxLed=maxLEDLighting(led.numbeOfLED, light);
//					 ta.setText("Maximum number of LEDs we can light is: " + MaxLed);
				}	
			
				scan.close();
			}catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
		
	
		});
		
////////////////////////////////////////////////////////////////////////img1 led
		Image img = new Image("Led.png");
		ImageView imgV = new ImageView(img);
///////////////////////////////////////////////////////img1 button	(led)	
		VBox vb2 = new VBox(23.70);
		// String []arr2=new String[6];

		Button btn11 = new Button("2");
		Button btn22 = new Button("6");
		Button btn33 = new Button("3");
		Button btn44 = new Button("5");
		Button btn55 = new Button("4");
		Button btn66 = new Button("1");
		vb2.getChildren().addAll(btn11, btn22, btn33, btn44, btn55, btn66);
		vb2.setLayoutX(307);
		vb2.setLayoutY(157);
		vb2.setMaxHeight(350);
		vb2.setMaxWidth(100);
		imgV.setFitHeight(350);
		imgV.setFitWidth(300);
		imgV.setLayoutX(50);
		imgV.setLayoutY(120);
		vb2.setVisible(false);

//////////////////////////////////////////////////
//  Button rest = new Button("Reset");
//  rest.setOnAction(e->{
//	  st1.setFill(Color.WHITE);
//	  st2.setFill(Color.WHITE);
//	  st3.setFill(Color.WHITE);
//	  st4.setFill(Color.WHITE);
//	  st5.setFill(Color.WHITE);
//	  st6.setFill(Color.WHITE);
//	 
//  });
  
  
		pan.getChildren().addAll(tx, chosser, imgV, vb2, vb3, imgV2, vb, lin1,lin2,lin3,lin4,lin5,lin6, txttable, ta,vbb);
		Scene sn = new Scene(pan, 800, 700);
		primaryStage.setScene(sn);
		primaryStage.setTitle("LED");
		primaryStage.show();

	}
	public static void main(String[] args) {
		launch(args);
	}
	 public static void DPTable(int[][] dp,TextArea ta1) {
	        for (int i = 0; i < dp.length; i++) {
	            for (int j = 0; j < dp[0].length; j++) {
	               ta1.appendText(dp[i][j] + " ");
	            }
	            ta1.appendText("\n");
	           
	        }
	    }
	 
	 
	}