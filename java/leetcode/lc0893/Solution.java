package lc0893;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numSpecialEquivGroups(String[] A) {
        if (A == null) {
            return 0;
        }
        if (A.length < 2) {
            return A.length;
        }
        Set<Item> items = new HashSet<>(A.length);
        for (String s : A) {
            items.add(Item.from(s));
        }
        return items.size();
    }

    static class Item {
        static final char[] EMPTY_CHARS = {};
        static final Item EMPTY = new Item(EMPTY_CHARS);

        char[] chars;
        int hash;

        Item(char[] chars) {
            this.chars = chars;
            hash = Arrays.hashCode(chars);
        }

        static Item from(String s) {
            if (s == null || s.isEmpty()) {
                return EMPTY;
            }
            char[] chars = s.toCharArray();
            if (chars.length < 3) {
                return new Item(chars);
            }
            sort(chars, 0, (chars.length & 1) == 0 ? chars.length - 2 : chars.length - 1);
            if (chars.length > 3) {
                sort(chars, 1, (chars.length & 1) == 0 ? chars.length - 1 : chars.length - 2);
            }
            return new Item(chars);
        }

        static void sort(char[] chars, int low, int high) {
            if (low >= high) {
                return;
            }
            int i = partition(chars, low, high);
            sort(chars, low, i - 2);
            sort(chars, i + 2, high);
        }

        static int partition(char[] chars, int low, int high) {
            char c = chars[high];
            int i = low - 2;
            for (int j = low; j <= high - 2; j += 2) {
                if (chars[j] < c) {
                    i += 2;
                    swap(chars, i, j);
                }
            }
            i += 2;
            swap(chars, i, high);
            return i;
        }

        static void swap(char[] chars, int i, int j) {
            char c = chars[i];
            chars[i] = chars[j];
            chars[j] = c;
        }

        @Override
        public int hashCode() {
            return hash;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof Item)) {
                return false;
            }
            Item that = (Item) o;
            return Arrays.equals(chars, that.chars);
        }
    }
}