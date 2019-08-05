package SPR;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class Note {
    private final List<String> comments = new ArrayList<>();
    private static int count = 0;

    void addComment(String text) {
        comments.add("" + (++count) + ": " + text);
    }

    void saveToFile(Note note, String filename) throws Exception {
        try (PrintStream out = new PrintStream(filename)) {
            out.println(note.toString());
        }
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), comments);
    }
}