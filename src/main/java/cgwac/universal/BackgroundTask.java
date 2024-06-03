package cgwac.universal;

import javax.swing.SwingWorker;

public class BackgroundTask extends SwingWorker<Void, Void> {

    @Override
    protected Void doInBackground() throws Exception {
        Thread.sleep(2000);
        return null;
    }

    @Override
    protected void done() {
        System.out.println("Successful Swing Worker");

    }
}