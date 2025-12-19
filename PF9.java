static int score(String word){
    return word.replaceAll("r", "").length();
}
score("rrrr")
score("arar")
List<Integer> list1 = new ArrayList<>();
list1.add(1)
list1.add(3)
list1.add(-6)
list1.add(10)
list1.add(-25)
list1
list1.sort(null)
list1
static Comparator<String> scoreComparator = new Comparator<String>() {
    public int compare(String w1, String w2) {
        return Integer.compare(score(w2), score(w1));
    }
};
List<String> List2 = new ArrayList<>();
List2.add("aaa")
List2.add("aaarrrr")
List2.add("aaar")
List2.add("aaarsdfasd")
List2.add("aaarsdfasdrrrrrrrrrrrr")
List2.add("rrrrrrrrrrrr")
List2
static List<String> rankeWords(List<String> words){
    words.sort(scoreComparator);
    return words;
}
rankeWords(List2)
static List<String> rankeWords2(List<String> words){
    return words.stream().sorted(scoreComparator).collect(Collectors.toList());
}
List2.add("rsdfssdf")
List2.add("r")
List2.add("a")
List2.add("aerw")
rankeWords2(List2)
static List<String> rankeWords3(Comparator<String> comparator, List<String> words){
    return words.stream().sorted(comparator).collect(Collectors.toList());
}
rankeWords3(scoreComparator, List2)
static int scoreWithBonus(String word) {
    int base = score(word);
    if (word.contains("f")) return base + 3;
    else return base;
}
static Comparator<String> scoreWithBonusComparator = new Comparator<String>() {
    public int compare(String w1, String w2) {
        return Integer.compare(scoreWithBonus(w2), scoreWithBonus(w1));
    }
};
rankeWords3(scoreWithBonusComparator, List2)
List2.add("fa")
rankeWords3(scoreWithBonusComparator, List2)
Comparator<String> scoreComparator2 = (w1, w2) -> Integer.compare(score(w1), score(w2));
Function<String, Integer> score2 = w -> w.replaceAll("r", "").length();
Function<String, Integer> scoreWithBonus = w -> w.replaceAll("f", "ffff").length();
Comparator<String> scoreComparator3 = (w1, w2) -> Integer.compare(score2.apply(w2), score2.apply(w1));
Comparator<String> scoreComparatorWithBonus = (w1, w2) -> Integer.compare(scoreWithBonus(w2), scoreWithBonus(w1));
Comparator<String> scoreComparatorWithBonus2 = (w1, w2) -> Integer.compare(scoreWithBonus(w2), scoreWithBonus(w1));
Function<String, Integer> scoreWithBonus2 = w -> w.replaceAll("f", "ffff").length();
Comparator<String> scoreComparatorWithBonus3 = (w1, w2) -> Integer.compare(scoreWithBonus2.apply(w2), scoreWithBonus2.apply(w1));
rankeWords3(scoreComparatorWithBonus2, List2)
rankeWords3(scoreComparator2, List2)
rankeWords3(scoreComparator3, List2)
rankeWords3(scoreComparatorWithBonus3, List2)
static List<String> rankeWords4(Function<String, Integer> wordScore, List <String> words){
    Comparator<String> wordComparator1 = (w1, w2) -> Integer.compare(wordScore.apply(w2), wordScore.apply(w1));
    return words.stream().sorted(wordComparator1).collect(Collectors.toList());
}
rankeWords4(w -> score2.apply(w), List2)
rankeWords4(w -> scoreWithBonus2.apply(w), List2)
