package Home_work_6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Ноутбук> ноутбуки = создатьМножествоНоутбуков();
        Map<Integer, String> критерии = создатьКритерииФильтрации();

        Map<Integer, Object> параметрыФильтрации = запроситьПараметрыФильтрации(критерии);

        Set<Ноутбук> результат = фильтроватьНоутбуки(ноутбуки, параметрыФильтрации);

        вывестиРезультат(результат);
    }

    private static Set<Ноутбук> создатьМножествоНоутбуков() {
        Set<Ноутбук> ноутбуки = new HashSet<>();

        // Добавить ноутбуки в множество
        ноутбуки.add(new Ноутбук("Ноутбук 1", 8, 512, "Windows 10", "Черный"));
        ноутбуки.add(new Ноутбук("Ноутбук 2", 16, 1024, "MacOS", "Серебристый"));
        ноутбуки.add(new Ноутбук("Ноутбук 3", 8, 256, "Windows 10", "Белый"));

        return ноутбуки;
    }

    private static Map<Integer, String> создатьКритерииФильтрации() {
        Map<Integer, String> критерии = new HashMap<>();

        критерии.put(1, "ОЗУ");
        критерии.put(2, "Объем ЖД");
        критерии.put(3, "Операционная система");
        критерии.put(4, "Цвет");

        return критерии;
    }

    private static Map<Integer, Object> запроситьПараметрыФильтрации(Map<Integer, String> критерии) {
        Map<Integer, Object> параметры = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (Map.Entry<Integer, String> entry : критерии.entrySet()) {
            System.out.print("Введите значение для критерия \"" + entry.getValue() + "\": ");
            String значение = scanner.nextLine();

            if (!значение.isEmpty()) {
                параметры.put(entry.getKey(), значение);
            }
        }

        return параметры;
    }

    private static Set<Ноутбук> фильтроватьНоутбуки(Set<Ноутбук> ноутбуки, Map<Integer, Object> параметрыФильтрации) {
        Set<Ноутбук> результат = new HashSet<>();

        for (Ноутбук ноутбук : ноутбуки) {
            boolean соответствуетФильтру = true;

            for (Map.Entry<Integer, Object> entry : параметрыФильтрации.entrySet()) {
                int критерий = entry.getKey();
                Object значение = entry.getValue();

                switch (критерий) {
                  case 1:
                  if (значение instanceof Integer) {
                      int минимальныйОбъемОЗУ = (int) значение;
                      if (ноутбук.getОбъемОЗУ() < минимальныйОбъемОЗУ) {
                          соответствуетФильтру = false;
                      }
                  }
                  break;
              case 2:
                  if (значение instanceof Integer) {
                      int минимальныйОбъемЖД = (int) значение;
                      if (ноутбук.getОбъемЖД() < минимальныйОбъемЖД) {
                          соответствуетФильтру = false;
                      }
                  }
                  break;
              case 3:
                  if (значение instanceof String) {
                      String минимальнаяОперационнаяСистема = (String) значение;
                      if (!ноутбук.getОперационнаяСистема().equalsIgnoreCase(минимальнаяОперационнаяСистема)) {
                          соответствуетФильтру = false;
                      }
                  }
                  break;
              case 4:
                  if (значение instanceof String) {
                      String минимальныйЦвет = (String) значение;
                      if (!ноутбук.getЦвет().equalsIgnoreCase(минимальныйЦвет)) {
                          соответствуетФильтру = false;
                      }
                  }
                  break;
              default:
                  break;
          }

          if (!соответствуетФильтру) {
              break;
          }
      }

      if (соответствуетФильтру) {
          результат.add(ноутбук);
      }
  }

  return результат;
}

private static void вывестиРезультат(Set<Ноутбук> результат) {
  if (результат.isEmpty()) {
      System.out.println("Ноутбуки, отвечающие фильтру, не найдены");
  } else {
      System.out.println("Ноутбуки, отвечающие фильтру:");
      for (Ноутбук ноутбук : результат) {
          System.out.println(ноутбук);
      }
  }
}
}


