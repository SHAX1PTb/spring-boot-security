package com.practise.LeetCode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FraudulentActivityNotificationTest  {

    @Test
    public void TestFraudActivityNotifcation(){
        FraudulentActivityNotification fraudulentActivityNotification = new FraudulentActivityNotification();

        int ret = fraudulentActivityNotification.activityNotifications(Arrays.asList(1,2,3,4,5,6,7,8,9,10),5);
        Assert.assertEquals(2,ret);

    }

}