public class 2.soru {
    //Bu kod ,verilen bir dizi linked listi birleştirerek tek bir sıralı linked list oluştrumayı amaçlar.
    import java.util.*;

public class SortedLinkedListMerger {
    public static ListNode mergeLists(List<List<Integer>> lists) {
        List<Integer> combinedList = new ArrayList<>();   //Linked listlerin elemanları birleştirilmek üzere combined list adlı bir liste içerisine eklenir.

        for (List<Integer> list : lists) {
            combinedList.addAll(list);
        }//combinedList listesi sıralanır,bunu Collections.sort() metodunu kullanarak gerçekleştiririz.Böylece combinedList sıralanamış hale gelir.

        Collections.sort(combinedList); //combinedList listesindeki elemanlar üzerinde iterasyon yapılır ve her eleman bir bağlantılı liste düğümüne dönüştürülerek bağlantılı liste oluşturulur.
        // Bu adımda, son düğümün referansını takip etmek için current adlı bir referans kullanılır.

        ListNode start = new ListNode(0);
        ListNode current = start;

        for (int num : combinedList) {
            current.next = new ListNode(num);
            current = current.next;
        }

        return start.next;//Değeri döndürür
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(1, 2, 4));
        lists.add(Arrays.asList(2, 3, 5));
        lists.add(Arrays.asList(3, 6));

        ListNode combinedList = mergeLists(lists);  // combinedList olarak değiştirildi

        System.out.print("Output: [");
        while (combinedList != null) {  // combinedList olarak değiştirildi
            System.out.print(combinedList.val);
            combinedList = combinedList.next;
            if (combinedList != null) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    // Bağlantılı liste düğüm sınıfı
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
}
