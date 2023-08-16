package com.test.question.Q097;



class Refrigerator {
    private Item[] items = new Item[100];
    private int itemCount = 0;

    public void add(Item item) {
        if (itemCount < 100) {
            items[itemCount] = item;
            itemCount++;
            System.out.printf("'%s'를 냉장고에 넣었습니다.\n", item.getName());
        } else {
            System.out.println("냉장고가 가득 찼습니다. 더 이상 아이템을 추가할 수 없습니다.");
        }
    }

    public Item get(String name) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getName().equals(name)) {
                Item item = items[i];
                // 아이템을 꺼낸 후 빈 자리를 메꾸기 위해 배열을 한 칸씩 앞으로 당김
                for (int j = i; j < itemCount - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[itemCount - 1] = null;
                itemCount--;
                return item;
            }
        }
        return null; // 해당 이름의 아이템이 없을 경우 null 반환
    }

    public int count() {
        return itemCount;
    }

    public void listItem() {
        System.out.println("[냉장고 아이템 목록]");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.printf("%s(%s)\n", item.getName(), item.getExpiration());
        }
    }
}

class Item {
    private String name;
    private String expiration;

    public void setName(String name) {
        this.name = name;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getName() {
        return name;
    }

    public String getExpiration() {
        return expiration;
    }
}
