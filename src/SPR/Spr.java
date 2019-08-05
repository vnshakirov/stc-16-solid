package SPR;

class Spr {
    public static void main(String[] args) throws Exception {
        Note note = new Note();
        note.addComment("First note");
        note.addComment("Second note");

        String filename = "notes.txt";
        note.saveToFile(note, filename);

        System.out.println(note);
    }
}