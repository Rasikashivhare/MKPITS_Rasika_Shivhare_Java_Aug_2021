//wap to accept dayno(between 1 and 7)
//and then display dayname(using switch case)
int main()
{
	int dayno;
	printf("enter dayno (1-7)");
	scanf("%d",&dayno);
	switch(dayno)
	{
    	case 1;
		printf("\n monday");
		break;
			case 2;
		printf("\n tuesday")
	    break;
		case 3;
		printf("\n wednesday");
	    break;
	    	case 4;
		printf("\n thursday");
	    break;
	    	case 5;
		printf("\n friday");
	    break;
	    	case 6;
		printf("\n saturday");
	    break;
	    	case 7;
		printf("\n sunday");
	    break;
	    default;
	    printf("\n invalid day no");
	    break;
	}
}
