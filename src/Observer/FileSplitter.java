package Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class FileSplitter {
	public List<IProgress> iProgressList;
	private int progressVal = 0;
	
	public FileSplitter() {
		this.iProgressList = new ArrayList<IProgress>();
	}

	public void addProgress(IProgress iProgress) {
		this.iProgressList.add(iProgress);
	}
	
	public void removeProgress(IProgress iProgress) {
		this.iProgressList.remove(iProgress);
	}
	
	public void split() {
		FileSplitter splitter = this;
		final Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				splitter.progressVal += 10;
				splitter.notifying(splitter.progressVal);
				if (splitter.progressVal == 100) {
					timer.cancel();
				}
			}
		};
		timer.schedule(task, 0, 500);
	}
	
	private void notifying(int val) {
		Iterator<IProgress> it = this.iProgressList.iterator();
		while(it.hasNext()) {
			IProgress iProgress = it.next();
			iProgress.onProgress(val);
		}
	}
}
