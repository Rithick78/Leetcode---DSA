class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        HashSet<String> ban = new HashSet<>();

        for (String word : banned) {
            ban.add(word.toLowerCase());
        }

        paragraph = paragraph.toLowerCase();

        paragraph = paragraph.replaceAll("[^a-z]", " ");

        String[] words = paragraph.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        String answer = "";
        int max = 0;

        for (String word : words) {

            if (ban.contains(word)) {
                continue;
            }

            int count = map.getOrDefault(word, 0) + 1;
            map.put(word, count);

            if (count > max) {
                max = count;
                answer = word;
            }
        }

        return answer;
    }
}