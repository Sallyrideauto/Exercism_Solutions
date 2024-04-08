class SqueakyClean {
    static String clean(String identifier) {
        String tmpIdentifier = identifier.replaceAll("\\s", "_").replaceAll("[^\\w_-]", "");
        StringBuilder builder = new StringBuilder(tmpIdentifier);
        while (builder.indexOf("-") != -1) {
            int index = builder.indexOf("-");
            builder = builder.replace(index, index + 1,
                    String.valueOf(Character.toUpperCase(builder.charAt(index + 1))));
            builder = builder.deleteCharAt(index + 1);
        }

        while (builder.indexOf("4") != -1 || builder.indexOf("3") != -1 || builder.indexOf("0") != -1
                || builder.indexOf("7") != -1 || builder.indexOf("1") != -1) {
            builder = builder.indexOf("4") != -1 ? builder.replace(builder.indexOf("4"), builder.indexOf("4") + 1, "a")
                    : builder;
            builder = builder.indexOf("3") != -1 ? builder.replace(builder.indexOf("3"), builder.indexOf("3") + 1, "e")
                    : builder;
            builder = builder.indexOf("0") != -1 ? builder.replace(builder.indexOf("0"), builder.indexOf("0") + 1, "o")
                    : builder;
            builder = builder.indexOf("7") != -1 ? builder.replace(builder.indexOf("7"), builder.indexOf("7") + 1, "t")
                    : builder;
            builder = builder.indexOf("1") != -1 ? builder.replace(builder.indexOf("1"), builder.indexOf("1") + 1, "l")
                    : builder;
        }
        return builder.toString();
    }
}