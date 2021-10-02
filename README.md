# Pastabos:

* Testai gerokai per paprasti ir nera nei vieno test case'o kuriame validatorius turetu grazinti `false`, todel uzteko funkciju kurios visuomet grazina `true` kad praeiti visus testus.
* Test case'ai kertasi, pvz., nors `passwordLengthTest` turetu buti teisingas, jame naudojamas slaptazodis neturi didziuju raidziu, del ko vis tiek fail'intu.
* Validator klase yra ne `static`, nors nesaugo jokio state.
* Yra viena validator klase visiems duomenims, kas siaip nera labai blogai, bet geriau butu atskiros klases.
* Validator funkcijos grazina tik `bool` - ar gerai, ar ne. Kadangi gali buti keli neteisingi dalykai vienu metu, yra neaisku kas tiksliai negerai.