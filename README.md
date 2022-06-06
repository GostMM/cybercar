# cybercar

## pour que le projet marche comme il faut il faut configurer l'environnement commme suit !  


### POUR WINDOWS
##### Assurez vous d'avoir java sdk 17 au minimum dans votre environement de devellopement ! 

- allez dans le dossier qui se situe dans <strong>/projet_Cyber-Car/javafx-sdk</strong> et il ya un dossier windows fx 

- il y'a des composant necessaire au lancement du graphisme devellopé en fxml 


> ![Capture d’écran 2022-06-03 à 07 27 30](https://user-images.githubusercontent.com/94891556/171781188-a0ba6c72-7db3-48e3-b3a6-ed2b33a36323.png)


- ce qu'il faut faire pour les utilisé allez y dans preferences de eclipse et faite une recherche sur la bar de recherche comme suit <quote>user</quote>



> ![Capture d’écran 2022-06-03 à 07 28 47](https://user-images.githubusercontent.com/94891556/171781658-b4631e4d-ed83-44fc-bcab-40e22f006a01.png)


- allez sur java/Build Path/User Librairie 



> ![Capture d’écran 2022-06-03 à 07 29 10](https://user-images.githubusercontent.com/94891556/171781853-1955b487-38aa-402e-a50c-c98e9e262d85.png)



- cliquer sur new pour ajouter une nouvelle librairie utilisateur et nommer le "javaFx" par exemple et valider ! 

> ![Capture d’écran 2022-06-03 à 07 29 53](https://user-images.githubusercontent.com/94891556/171781968-93b088b5-b8df-4a2c-a422-a1ad5a87647d.png)


- cliquer ensuite la librairie que vous avez creer et faites Add External JARs  et ajouter les composant se situant dans le dossier windows fx > <strong>lib</strong>

> ![Capture d’écran 2022-06-03 à 07 47 56](https://user-images.githubusercontent.com/94891556/171782278-463237a0-9192-4dc9-b531-318e37fc6ca2.png)

- et ç vous donnera ça normalement 

> ![Capture d’écran 2022-06-03 à 07 30 13](https://user-images.githubusercontent.com/94891556/171782476-94a1b897-90fd-4676-9c39-4aeab91e584b.png)


> fermer les fenetre que vous avez ouvert et faite un clic doite sur le dossier et allez y dans Build path et configure 


> ![Capture d’écran 2022-06-03 à 07 30 58](https://user-images.githubusercontent.com/94891556/171782817-7d86d5b0-cbef-446b-aa5d-0ff836102701.png)


- vous aurez cette interface et cliquer sur class path et faites  Add Librairy 

> ![Capture d’écran 2022-06-03 à 07 31 13](https://user-images.githubusercontent.com/94891556/171783026-30477927-a22e-4c38-b262-3bc83f2d6553.png)


 - vous arriverez là et cliquer sur user librairie 


> ![Capture d’écran 2022-06-03 à 07 31 37](https://user-images.githubusercontent.com/94891556/171783100-c1eb66d2-d212-40e3-8462-e81b5e024ba6.png)


- et cochez la librairie que vous avez creer 

> ![Capture d’écran 2022-06-03 à 07 31 46](https://user-images.githubusercontent.com/94891556/171783225-301ef183-8b2e-4a2f-88c6-978c787ed959.png)


>>>>>> et faite finish 


#### Faites exactement pareil  pour le dossier librairie  <strong>/projet_Cyber-Car/librairie 
  - vous creer la librairie et vous l'ajouter dans le classpath 

 
> une derniere etape c'est de faire un run avec configuration et vous atterirez là 
  
  >![Capture d’écran 2022-06-03 à 07 32 12](https://user-images.githubusercontent.com/94891556/171783680-ac573471-c912-48fc-adb4-47155f56798d.png)
    
  
- Allez dans la partie argument 
  
  
  >![Capture d’écran 2022-06-03 à 07 32 24](https://user-images.githubusercontent.com/94891556/171783839-57cbf6b3-aa61-4065-86f4-3cabfe7b83d8.png)
  
    
- et mettez dans VM argument
  
  
  
```
 --module-path 	VOTRE/CHEMIN/VERS/javafx-sdk/windows fx/lib --add-modules javafx.controls,javafx.fxml
```
  
### Pour Mac 
##### Assurez vous d'avoir java sdk 17 au minimum 
  
  > c'est ecatement les même proceder sauf que le dossier fx à utiliser , c'est javafx-sdk/lib 

  
```
 --module-path 	VOTRE/CHEMIN/VERS/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml
``` 
  
  
  
