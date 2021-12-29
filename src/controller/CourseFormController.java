package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import view.TM.CourseTM;

public class CourseFormController {
    public TextField txtCourseID;
    public JFXTextField txtCourseName;
    public JFXTextField txtCourseDuration;
    public JFXTextField txtCourseFee;
    public JFXButton btnSaveCourse;
    public JFXButton btnUpdateCourse;
    public TableView<CourseTM> tblCourse;
    public TableColumn<CourseTM , String> colCourseID;
    public TableColumn <CourseTM , String> colCourseName;
    public TableColumn <CourseTM , String> colCourseDuration;
    public TableColumn <CourseTM , Double> colCourseFee;
    public JFXButton btnDeleteCourse;

    public void btnSaveCourseOnAction(ActionEvent actionEvent) {
    }

    public void btnUpdateCourseOnAction(ActionEvent actionEvent) {
    }

    public void btnDeleteCourseOnAction(ActionEvent actionEvent) {
    }
}
