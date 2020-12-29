package part5;

public class Task02 {
    public static void main(String[] args) {
        System.out.println(canMove("Rook", "A8", "H8"));
        System.out.println(canMove("Bishop", "A7", "G1"));
        System.out.println(canMove("Queen", "C4", "D6"));
    }

    private static boolean canMove(String str, String current, String target) {
        // По горизонтали расстояние
        int h = Math.abs((current.charAt(0) - 'A') - (target.charAt(0) - 'A'));

        // По вертикали расстояние
        int v = Math.abs(Integer.parseInt(current.substring(1,2)) - Integer.parseInt(target.substring(1,2)));

        // Король. Передвижение только по одной клетке
        // Ферзь. Движение или горизонтально или вертикально,
        // или горизонтальное = вертикальному (диагональ).
        // Ладья. Передвижение только горизонтальное или вертикальное
        // Слон. Передвижение диагональное( горизонтальное = вертикальному)
        // Конь. Вертикальное = 1 и горизонтальное = 2.
        // Пешка. Передвижение только вертикальное и только на 2 клетки максимум
        return switch (str) {
            case "King" -> h <= 1 && v <= 1;
            case "Queen" -> (h == 0 || v == 0) || h == v;
            case "Rook" -> h == 0 || v == 0;
            case "Bishop" -> h == v;
            case "knight" -> (h == 2 && v == 1) || (h == 1 && v == 2);
            case "Pawn" -> h == 0 && v <= 2;
            default -> false;
        };
    }
}
