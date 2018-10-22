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
public interface WaterTankController {
    public AlarmForm getAlarm()throws Exception;
    public Display getDisplay()throws Exception;
    public ProgressBar getProgressBar() throws  Exception;
}
