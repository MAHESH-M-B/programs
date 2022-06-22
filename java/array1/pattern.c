int i,j,d=1,p;

	for(i=0;i<5;i++){
		for(j=4;j>i;j--){
			printf("  ");
		}
		for(p=0;p<d;p++){
			printf("*");
		}printf("\n");
		d=d+2;

		}


d=7;
      for(i=0;i<5;i++){


			for(j=0;j<=i;j++){
				printf("  ");
			}
			for(p=0;p<d;p++){

				printf("*");
			}d=d-2;
			printf("\n");

		}