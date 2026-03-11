public class BannerApp {

    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static String[] getCharacterPattern(CharacterPatternMap[] patterns, char ch) {
        for (CharacterPatternMap pattern : patterns) {
            if (pattern.getCharacter() == ch) {
                return pattern.getPattern();
            }
        }
        return null;
    }

    public static void renderBanner(String message, CharacterPatternMap[] patterns) {
        int height = 7;

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < message.length(); j++) {
                String[] charPattern = getCharacterPattern(patterns, message.charAt(j));
                if (charPattern != null) {
                    line.append(charPattern[i]).append("  ");
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] P = {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };

        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        renderBanner("OOPS", patterns);
    }
}