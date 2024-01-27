package MVCStudentApp.Controller;

import MVCStudentApp.Controller.Interfaces.IGetModel;
import MVCStudentApp.Controller.Interfaces.IGetView;
import MVCStudentApp.Model.Domain.Student;

import java.util.*;

public class ControllerClass {

    // Поле со всеми доступными в контроллере моделями Model
    private Map<String, IGetModel> models = new HashMap<>();
    // Поле со всеми доступными в контроллере видами View
    private Map<String, IGetView> views = new HashMap<>();
    // Поле текущий выбранный View
    private String currentView;
    // Поле текущий выбранный Model
    private String currentModel;

    // Поле лист студентов
    private List<Student> studList = new ArrayList<>();

    /**
     * Конструктор
     *
     * @param model модель
     * @param view  вью
     */
    public ControllerClass(IGetModel model, IGetView view) {
        addModel(model);
        addView(view);
    }

    // Геттеры и сеттеры
    public List<String> getModels() {
        return models.keySet().stream().toList();
    }
    public List<String> getViews() {
        return views.keySet().stream().toList();
    }
    public String getCurrentView() {
        return currentView;
    }
    public void setCurrentView(String currentView) {
        if (views.containsKey(currentView)) {
            this.currentView = currentView;
        }
    }
    public String getCurrentModel() {
        return currentModel;
    }
    public void setCurrentModel(String currentModel) {
        if (models.containsKey(currentModel)) {
            this.currentModel = currentModel;
        }
    }

    /**
     * Добавляет модель в контроллер
     *
     * @param model
     * @return boolean - ИСТИНА если такой модели еще не добавлено, ЛОЖЬ в противном случае
     */
    public boolean addModel(IGetModel model) {
        if (!this.models.containsKey(model.getModelName())) {
            this.models.put(model.getModelName(), model);
            currentModel = model.getModelName();
            return true;
        }
        return false;
    }

    /**
     * Добавляет вью в контроллер
     *
     * @param view
     * @return boolean - ИСТИНА если такой вью еще не добавлено, ЛОЖЬ в противном случае
     */
    public boolean addView(IGetView view) {
        if (!this.views.containsKey(view.getLang())) {
            this.views.put(view.getLang(), view);
            currentView = view.getLang();
            return true;
        }
        return false;
    }

    /**
     * Тестируем данные, что в списке студентов что-то есть
     *
     * @param stud
     * @return
     */
    private boolean testData(List<Student> stud) {
        if (stud.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Обновляем данные
     *
     * @param request
     */
    public void update(String request) {
        //MVC

        //MVP
        studList = models.get(currentModel).getStudents();
        if (testData(studList)) {
            views.get(currentView).printAllStudents(studList);
        } else {
            System.out.println("Список студентов пуст!");
        }
    }

    /**
     * Запуск контроллера на исполнение
     */
    public void run() {
        Command com = (Command) Command.NONE;
        boolean getNewIter = true;
        while (getNewIter) {

            String command = views.get(currentView).inputCommand();
            try {
                com = Command.valueOf(command.toUpperCase());
                switch (com) {
                    case EXIT:
                        getNewIter = false;
                        views.get(currentView).exitMessage();
                        break;
                    case LIST:
                        for (Map.Entry<String, IGetModel> model : models.entrySet()) {
                            views.get(currentView).printAllStudents(model.getValue().getStudents());
                        }
                        break;
                    case DELETE:
                        int numStudentToDelete = views.get(currentView).getStudentNumber();
                        for (Map.Entry<String, IGetModel> model : models.entrySet()) {
                            views.get(currentView).removedStudent(model.getValue().removeStudent(numStudentToDelete));
                        }
                        break;
                    case LANG:
                        System.out.println(getViews());
                        setCurrentView(views.get(currentView).selectLang().toUpperCase());
                        break;
                }

            } catch (IllegalArgumentException e) {
                views.get(currentView).incorrectCommand();
            }
        }
    }

}
