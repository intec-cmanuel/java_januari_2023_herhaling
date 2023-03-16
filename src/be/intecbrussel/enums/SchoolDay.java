package be.intecbrussel.enums;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public enum SchoolDay {
    MONDAY(SchoolTask.LESSON, SchoolTask.LESSON),
    TUESDAY(SchoolTask.LESSON, SchoolTask.LESSON),
    WEDNESDAY(SchoolTask.SELFSTUDIE, SchoolTask.LESSON),
    THURSDAY(SchoolTask.LESSON, SchoolTask.LESSON),
    FRIDAY(SchoolTask.FEEDBACK, SchoolTask.SELFSTUDIE);

    private SchoolTask morningTask;
    private SchoolTask afternoonTask;

    SchoolDay(SchoolTask morningTask, SchoolTask afternoonTask) {
        this.morningTask = morningTask;
        this.afternoonTask = afternoonTask;
    }

    public SchoolTask getMorningTask() {
        return morningTask;
    }

    public SchoolTask getAfternoonTask() {
        return afternoonTask;
    }

    private enum SchoolTask {
        SELFSTUDIE,
        LESSON,
        FEEDBACK;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
}
