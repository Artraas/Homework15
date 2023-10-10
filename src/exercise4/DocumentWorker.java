package exercise4;

import java.util.Scanner;

public class DocumentWorker {
    void openDocument() {
        System.out.println("Документ відкритий");
    }
    void editDocument() {
        System.out.println("Правка документа доступна у версії Про");
    }
    void saveDocument() {
        System.out.println("Збереження документа доступне у версії Про");
    }

    public static void main(String[] args) {
        System.out.println("Введіть Ваш ключ:");
        Scanner scaner = new Scanner(System.in);
        String key = scaner.next();

        if (key.equals("pro")) {
            ProDocumentWorker pro = new ProDocumentWorker();
            pro.openDocument();
            pro.editDocument();
            pro.saveDocument();
        } else
            if (key.equals("exp")) {
            ExpertDocumentWorker exp = new ExpertDocumentWorker();
            exp.openDocument();
            exp.editDocument();
            exp.saveDocument();
        }else {
            DocumentWorker user = new DocumentWorker();
            user.openDocument();
            user.editDocument();
            user.saveDocument();
        }
    }
}
class ProDocumentWorker extends DocumentWorker {

    void editDocument() {
        System.out.println("Документ відредаговано");
    }
    void saveDocument() {
        System.out.println("Документ збережено у старому форматі, збереження в інших форматах доступне у версії Експерт");
    }
}
class ExpertDocumentWorker extends ProDocumentWorker {
    void saveDocument() {
        System.out.println("Документ збережений в новому форматі");
    }
}