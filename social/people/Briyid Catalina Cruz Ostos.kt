var cata = Person("Briyid Catalina Cruz Ostos")
cata.addOccupation("Estudiante de ingeniería de sistemas", "Universidad Distrital Francisco José de Caldas")
cata.addOccupation("Trabajos universitarios") // debe cumplir con entregas
cata.setInterests(listOf("Gymnasium", "cardio")) 
cata.setPossibleInterests(listOf("Artes marciales", "running"))

fun chatLog() {
    // 2023-09-12
    cata.write("Sabes mucho sobre las actividades de la UNAL, la verdad yo no tenía ni idea.")
    cata.write("Pues por el momento sí, porque si te soy sincera yo soy más de ejercicio pesada jaja")
    cata.write("Me encantaría, sería muy lindo de tú parte.")
    // 2023-09-21
    cata.write("Estoy un poco preocupada así que me intentaré recuperar en el segundo corte tal y como hice en el semestre pasado")
    cata.write("La cuestión es por lo que a veces me toca trabajar, entonces me queda muy poco tiempo")
    cata.write("Es muy difici tener tiempo para todo pero lo estoy intentando")
}