module workshopJavafxJdbc {
	requires javafx.controls;
	requires javafx.fxml;

	opens application to javafx.graphics, javafx.fxml, javafx.controls;
	opens gui to javafx.graphics, javafx.fxml, javafx.controls;
	opens model.entities to javafx.graphics, javafx.fxml, javafx.base;
	opens model.services to javafx.graphics, javafx.fxml;
}
