package twitter4j;

/**
 * .
 */
public class TwitterVideoUploadResult {

    public enum TwitterUploadStatus {

        IN_PROGRESS,

        COMPLETED,

        FAILED

    }

    private TwitterUploadStatus status;

    private long waitingTime;

    public TwitterVideoUploadResult(TwitterUploadStatus status, long waitingTime) {
        this.status = status;
        this.waitingTime = waitingTime;
    }

    public TwitterUploadStatus getStatus() {
        return status;
    }

    public long getWaitingTime() {
        return waitingTime;
    }
}
