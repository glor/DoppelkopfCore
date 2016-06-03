package dokoCore.Interfaces;

/**
 * Game should be executed by creating a new game through creating a new thread.
 * Every step that either needs redrawing or interacting causes this thread to pause itself.
 */
public interface Game extends Runnable {
    /**
     * Method for creating a Thread.
     */
    @Override
    void run();
}