import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    // 리스트의 중복을 제거하고 새로운 세트를 반환
    public static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    // 새로운 세트를 컬렉션에 추가하고, 추가 여부를 반환
    public static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    // 두 컬렉션에 교환 가능한 카드가 있는지 확인
    public static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        for (String card : myCollection) {
            if (!theirCollection.contains(card)) {
                for (String theirCard : theirCollection) {
                    if (!myCollection.contains(theirCard)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // 여러 컬렉션에서 공통된 카드를 찾아 세트로 반환
    public static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> common = new HashSet<>(collections.get(0));
        for (Set<String> collection : collections) {
            common.retainAll(collection);
        }
        return common;
    }

    // 모든 컬렉션의 카드를 하나의 세트로 합침
    public static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new HashSet<>();
        for (Set<String> collection : collections) {
            all.addAll(collection);
        }
        return all;
    }
}
