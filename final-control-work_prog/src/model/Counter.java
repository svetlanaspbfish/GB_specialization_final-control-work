package model;

public class Counter implements AutoCloseable {
    private static int count;

    public void add() {
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void close() throws Exception {
        // Проверяем, была ли работа с объектом типа Counter в ресурсном try и закрываем ресурсы.
        if (count == 0) {
            throw new IllegalStateException("Ресурс не был использован");
        }
    }
}