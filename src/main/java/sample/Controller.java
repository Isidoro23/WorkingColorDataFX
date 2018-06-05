package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable
{

  @FXML
  Button sortBtn;

  @FXML
  Button blueBtn;

  @FXML
  Button greenBtn;

  @FXML
  Button indigoBtn;

  @FXML
  Button orangeBtn;

  @FXML
  Button redBtn;

  @FXML
  Button violetBtn;

  @FXML
  Button yellowBtn;

  @FXML
  TextArea myTextArea;
  String msg;

  @FXML
  public void sortButton(ActionEvent event) throws IOException {
    readNSort();
  }

  @FXML
  public void blueButton(ActionEvent event) throws IOException {
    blueSort();
  }

  @FXML
  public void greenButton(ActionEvent event) throws IOException {
    greenSort();
  }

  @FXML
  public void indigoButton(ActionEvent event) throws IOException {
    indigoSort();
  }

  @FXML
  public void orangeButton(ActionEvent event) throws IOException {
    orangeSort();
  }

  @FXML
  public void redButton(ActionEvent event) throws IOException {
    redSort();
  }

  @FXML
  public void violetButton(ActionEvent event) throws IOException {
    violetSort();
  }

  @FXML
  public void yellowButton(ActionEvent event) throws IOException {
    yellowSort();
  }



  File file = new File("/vnx1/home/sami/FullColorData.txt");

  List<String> temp = new ArrayList<>();
  List<String> blue = new ArrayList<>();
  List<String> green = new ArrayList<>();
  List<String> indigo = new ArrayList<>();
  List<String> orange = new ArrayList<>();
  List<String> red = new ArrayList<>();
  List<String> violet = new ArrayList<>();
  List<String> yellow = new ArrayList<>();
  List<String> master = new ArrayList<>();

  @FXML
  public void readNSort() throws IOException {

    String line;
    int color = 0;

    BufferedReader br = new BufferedReader(new FileReader(file));

    String st;
    while ((st = br.readLine()) != null) {

      line = st;

      if (line.contains("Blue"))
        color = 1;
      else if (line.contains("Green"))
        color = 2;
      else if (line.contains("Indigo"))
        color = 3;
      else if (line.contains("Orange"))
        color = 4;
      else if (line.contains("Red"))
        color = 5;
      else if (line.contains("Violet"))
        color = 6;
      else if (line.contains("Yellow"))
        color = 7;

      if (temp.size() != 6)
        temp.add(line);

      if (temp.size() == 5) {
        if (color == 1) {
          for (int i = 0; i < 5; i++) {
            blue.add(temp.get(i));
          }
        } else if (color == 2) {
          for (int i = 0; i < 5; i++) {
            green.add(temp.get(i));
          }
        } else if (color == 3) {
          for (int i = 0; i < 5; i++) {
            indigo.add(temp.get(i));
          }
        } else if (color == 4) {
          for (int i = 0; i < 5; i++) {
            orange.add(temp.get(i));
          }
        } else if (color == 5) {
          for (int i = 0; i < 5; i++) {
            red.add(temp.get(i));
          }
        } else if (color == 6) {
          for (int i = 0; i < 5; i++) {
            violet.add(temp.get(i));
          }
        } else if (color == 7) {
          for (int i = 0; i < 5; i++) {
            yellow.add(temp.get(i));
          }
        }

        temp.clear();
      }

    }

    for (String aBlue : blue) {
      master.add(aBlue + System.lineSeparator());
    }

    for (String aGreen : green) {
      master.add(aGreen + System.lineSeparator());
    }

    for (String aIndigo : indigo) {
      master.add(aIndigo + System.lineSeparator());
    }

    for (String aOrange : orange) {
      master.add(aOrange + System.lineSeparator());
    }

    for (String aRed : red) {
      master.add(aRed + System.lineSeparator());
    }

    for (String aViolet : violet) {
      master.add(aViolet + System.lineSeparator());
    }

    for (String aYellow : yellow) {
      master.add(aYellow + System.lineSeparator());
    }

    StringBuffer result = new StringBuffer();
    for (int j = 0; j < master.size(); j++) {
      result.append(master.get(j));

      //result.append( optional separator );
    }
    String sortedMsg = result.toString();

    myTextArea.setText(sortedMsg);

  }

  @FXML
  public void blueSort()
  {
    List<String> bmaster = new ArrayList<>();

    for (String aBlue : blue) {
      bmaster.add(aBlue + System.lineSeparator());
    }
    StringBuffer result = new StringBuffer();
    for (int j = 0; j < bmaster.size(); j++) {
      result.append(bmaster.get(j));

      //result.append( optional separator );
    }
    String sortedMsg = result.toString();

    myTextArea.setText(sortedMsg);
  }

  @FXML
  public void greenSort()
  {
    List<String> gmaster = new ArrayList<>();

    for (String aGreen : green) {
      gmaster.add(aGreen + System.lineSeparator());
    }
    StringBuffer result = new StringBuffer();
    for (int j = 0; j < gmaster.size(); j++) {
      result.append(gmaster.get(j));

      //result.append( optional separator );
    }
    String sortedMsg = result.toString();

    myTextArea.setText(sortedMsg);
  }

  @FXML
  public void indigoSort()
  {
    List<String> imaster = new ArrayList<>();

    for (String aBlue : indigo) {
      imaster.add(aBlue + System.lineSeparator());
    }
    StringBuffer result = new StringBuffer();
    for (int j = 0; j < imaster.size(); j++) {
      result.append(imaster.get(j));

      //result.append( optional separator );
    }
    String sortedMsg = result.toString();

    myTextArea.setText(sortedMsg);
  }

  @FXML
  public void orangeSort()
  {
    List<String> omaster = new ArrayList<>();

    for (String aBlue : orange) {
      omaster.add(aBlue + System.lineSeparator());
    }
    StringBuffer result = new StringBuffer();
    for (int j = 0; j < omaster.size(); j++) {
      result.append(omaster.get(j));

      //result.append( optional separator );
    }
    String sortedMsg = result.toString();

    myTextArea.setText(sortedMsg);
  }

  @FXML
  public void redSort()
  {
    List<String> rmaster = new ArrayList<>();

    for (String aBlue : red) {
      rmaster.add(aBlue + System.lineSeparator());
    }
    StringBuffer result = new StringBuffer();
    for (int j = 0; j < rmaster.size(); j++) {
      result.append(rmaster.get(j));

      //result.append( optional separator );
    }
    String sortedMsg = result.toString();

    myTextArea.setText(sortedMsg);
  }

  @FXML
  public void violetSort()
  {
    List<String> vmaster = new ArrayList<>();

    for (String aBlue : violet) {
      vmaster.add(aBlue + System.lineSeparator());
    }
    StringBuffer result = new StringBuffer();
    for (int j = 0; j < vmaster.size(); j++) {
      result.append(vmaster.get(j));

      //result.append( optional separator );
    }
    String sortedMsg = result.toString();

    myTextArea.setText(sortedMsg);
  }

  @FXML
  public void yellowSort()
  {
    List<String> ymaster = new ArrayList<>();

    for (String aBlue : yellow) {
      ymaster.add(aBlue + System.lineSeparator());
    }
    StringBuffer result = new StringBuffer();
    for (int j = 0; j < ymaster.size(); j++) {
      result.append(ymaster.get(j));

      //result.append( optional separator );
    }
    String sortedMsg = result.toString();

    myTextArea.setText(sortedMsg);
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {

    try {
      readNSort();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}