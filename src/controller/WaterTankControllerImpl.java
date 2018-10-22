/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.AlarmForm;
import view.Display;
import view.ProgressBar;

/**
 *
 * @author Sandun Jayasooriya
 */
public class WaterTankControllerImpl implements WaterTankController{
    private AlarmForm alarm;
    private Display display;
    private ProgressBar  progressBar;
    
    public WaterTankControllerImpl(){
        alarm=new AlarmForm();
        alarm.setVisible(true);
        display=new Display();
        display.setVisible(true);
        progressBar=new ProgressBar();
        progressBar.setVisible(true);
    }

    @Override
    public AlarmForm getAlarm() throws Exception {
        return alarm;
    }

    @Override
    public Display getDisplay() throws Exception {
        return display;
    }

    @Override
    public ProgressBar getProgressBar() throws Exception {
        return progressBar;
    }
    
}
