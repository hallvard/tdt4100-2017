package stateandbehavior;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class StopWatchController {

	StopWatch stopWatch;
	FxmlTimer fxmlTimer;
	
	@FXML
	void initialize() {
		stopWatch = new StopWatch();
		fxmlTimer = new FxmlTimer(this, "#handleRealTick");
	}
	
	@FXML Label ticksOutput;
	@FXML Label timeOutput;
	@FXML Label lastLapTimeOutput;
	@FXML Label lapTimeOutput;

	void updateView() {
		ticksOutput.setText("Ticks: " + stopWatch.getTicks());
		timeOutput.setText("Time: " + stopWatch.getTime());
		lastLapTimeOutput.setText("Last lap time: " + stopWatch.getLastLapTime());
		lapTimeOutput.setText("Lap: " + stopWatch.getLapTime());
	}
	
	@FXML public void handleTickAction() {
		stopWatch.tick(1);
		updateView();
	}
	@FXML public void handleTick10Action() {
		stopWatch.tick(10);
		updateView();
	}
	@FXML public void handleStartRealTimerAction() {
		fxmlTimer.start(1000, 1000);
		updateView();
	}
	public void handleRealTick(long duration) {
		stopWatch.tick((int)(duration / 1000));
		updateView();
	}
	@FXML public void handleStartAction() {
		stopWatch.start();
		updateView();
	}
	@FXML public void handleLapAction() {
		stopWatch.lap();
		updateView();
	}
	@FXML public void handleStopAction() {
		stopWatch.stop();		
		updateView();
	}
}
