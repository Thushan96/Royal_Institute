package lk.ijse.pos.hibernate.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import lk.ijse.pos.hibernate.view.TM.StudentTM;

public class StudentFormController {
    public JFXComboBox cmbCourseNameSearch;
    public JFXTextField txtStId;
    public JFXTextField txtStName;
    public JFXTextField txtStAddress;
    public JFXDatePicker txtStDob;
    public RadioButton rbtnMale;
    public RadioButton rbtnFemale;
    public JFXTextField txtStMobile;
    public JFXButton btnUpdateStudent;
    public JFXButton btnDeleteStudent;
    public TableView<StudentTM> tblStudent;
    public TableColumn<StudentTM,String> colRegNo;
    public TableColumn <StudentTM,String> colCourseName;
    public TableColumn <StudentTM,String> colStNo;
    public TableColumn <StudentTM,String> colStName;
    public TableColumn <StudentTM,String> colStAddress;
    public TableColumn <StudentTM,String> colStContact;
    public TableColumn <StudentTM,String>colStDOB;
    public TableColumn <StudentTM,String> colStGender;
    public JFXButton btnRefreshTbl;

    public void cmbCourseNameSearchOnAction(ActionEvent actionEvent) {
    }

    public void txtStIdOnAction(ActionEvent actionEvent) {
    }

    public void btnUpdateStudentOnAction(ActionEvent actionEvent) {
    }

    public void btnDeleteStudentOnAction(ActionEvent actionEvent) {
    }

    public void btnRefreshTblOnAction(ActionEvent actionEvent) {
    }
}
