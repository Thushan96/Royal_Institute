package controller;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import view.TM.CourseTM;


public class RegistrationFormController {
    public JFXTextField txtStName;
    public Label lblStID;
    public RadioButton rbtnMale;
    public RadioButton rbtnFemale;
    public JFXDatePicker dpDate;
    public JFXDatePicker dpStDOB;
    public JFXTextField txtStAddress;
    public JFXComboBox cmbCourseID;
    public Label lblCourseID;
    public JFXTextField txtCourseDuration;
    public JFXTextField txtCourseFee;
    public JFXTextField txtStMobileNumber;
    public TableView<CourseTM> tblRegistration;
    public TableColumn<CourseTM,String> colCourseID;
    public TableColumn <CourseTM,String> colCourseName;
    public TableColumn <CourseTM,String> colCourseDuration;
    public TableColumn <CourseTM,Double> colCourseFee;
    public JFXButton btnAdd;
    public JFXButton btnRemove;
    public JFXTextField txtTotal;
    public JFXButton btnReg;
    public Label lblRegID;

    public void btnRegOnAction(ActionEvent actionEvent) {
    }

    public void btnRemoveOnAction(ActionEvent actionEvent) {
    }

    public void btnAddOnAction(ActionEvent actionEvent) {
    }

    public void cmbCourseIDOnAction(ActionEvent actionEvent) {
    }
}
