package aqa_hw_7.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("--->>>  Test with name " + result.getName() + "is failed");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("--->>>  Test " + result.getName() + " succesfully started");
    }

    @Override
    public void onFinish(ITestContext result) {
        System.out.println("--->>> Test " + result.getName() + " succesfully finished");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("--->>>  Test " +result.getName() + " skipped");
    }
}
