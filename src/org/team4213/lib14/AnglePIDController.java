/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.team4213.lib14;

/**
 *
 * @author hughest1
 */
public class AnglePIDController extends PIDController {

    public AnglePIDController(double kp, double ki, double maxIInfluence, double kd) {
        super(kp, ki, maxIInfluence, kd);
    }
    public double feedAndGetValue(double currentAngle) {
        // TODO: Implement this; should figure out the minimum magnitude angle between current and target angles.
        return super.feedAndGetValue(currentAngle);
    }
}
