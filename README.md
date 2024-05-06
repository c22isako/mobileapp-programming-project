
# Rapport

**Skriv din rapport här!**

Skiss/design-idé



**Webbtjänst - JSON**

Data skrevs in i webbtjänsten som vi fått, admingränssnittet, där datan applicerades på den 
rubrik som innehöll den datatyp som passade. exempelvis sattes mognadstid till size, även om den
inte explicivt passar under rubriken, då datatypen passade. Detta eftersom vi oavsätt kommer ändra 
namnet på deras koppling, och ersätta size med exempelvis mognadstid i presentationen på appen.

**Övrig text om implementationen**
Lade till en recyclerview i activity_main. Tog även bort textviewn som fanns där vid forkningen 
av appen.
```
<androidx.recyclerview.widget.RecyclerView
android:id="@+id/recycler_view"
android:layout_width="match_parent"
android:layout_height="match_parent"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintLeft_toLeftOf="parent"
app:layout_constraintRight_toRightOf="parent"
app:layout_constraintTop_toTopOf="parent" />
```
Skapar en ny layout, recyclerviewitem, som innehåller en textview. Detta genom Layout > new > Layout
Resource File, där jag även gjorde denna till en Linear Layout.


**Implementationsexempel**



**Implementationsexempel VG (för de som satsar på VG)**

            // ingen VG!


**Reflektion**








Programkod ska se ut som exemplet nedan. Koden måste vara korrekt indenterad då den blir lättare att läsa vilket gör det lättare att hitta syntaktiska fel.

```
function errorCallback(error) {
    switch(error.code) {
        case error.PERMISSION_DENIED:
            // Geolocation API stöds inte, gör något
            break;
        case error.POSITION_UNAVAILABLE:
            // Misslyckat positionsanrop, gör något
            break;
        case error.UNKNOWN_ERROR:
            // Okänt fel, gör något
            break;
    }
}
```

Bilder läggs i samma mapp som markdown-filen.

![](android.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
