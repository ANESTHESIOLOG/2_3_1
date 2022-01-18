package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.dao.CarDAO;

@Controller
@RequestMapping("/cars")
public class CarsController {
//    Задание:
//1. Создайте еще один контроллер, замаппленный на /cars.
//2. Создайте модель Car с тремя произвольными полями.
//3. Создайте список из 5 машин.
//4. Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.
//5. Создайте страницу cars.html. Реализуйте создание таблицы с машинами из сервиса с помощью thymeleaf.
//6. При запросе /cars выводить весь список. При запросе /cars?count=2 должен отобразиться список из 2 машин,
//при /cars?count=3 - из 3, и тд. При count ≥ 5 выводить весь список машин.


    private final CarDAO carDao;

    @Autowired
    public CarsController(CarDAO carDao) {
        this.carDao = carDao;
    }


    @GetMapping()
    public String index(Model model) {
        //Получим всех машин из дао и передадим на отображение в представлении
        model.addAttribute("car", carDao.index());
        return "index2";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        //Получим одного человека по ИД из ДАО и передадим его на отображение в представлении
        model.addAttribute("car", carDao.show(id));
        return "show";
    }
}
