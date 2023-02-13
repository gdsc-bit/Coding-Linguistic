#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node *next;
};

struct node * insert_beg(struct node *head){
    int data;
    printf("enter element :");
    scanf("%d",&data);
    
    struct node *ptr = (struct node *) malloc(sizeof(struct node));
    ptr->next = head;
    ptr->data = data;
    return ptr;
}

struct node * insert_at_index(struct node *head,int index){
    int data;
    printf("enter element :");
    scanf("%d",&data);
    struct node *ptr = (struct node *) malloc(sizeof(struct node));
    struct node *p =head;
    int i=0;
    while(i!=index-1){
        if (p->next == NULL){
            printf("\nIndex not found\n");
            return head;
        }
        p=p->next;
        i++;
    }
    ptr->next = p->next;
    p->next = ptr;
    ptr->data =data;
    return head;
}

struct node * insert_at_end(struct node *head){
    int data;
    printf("enter element :");
    scanf("%d",&data);
    struct node *ptr = (struct node *) malloc(sizeof(struct node));
    struct node *p = head;
    while (p->next!=NULL){
        p=p->next;
    }
    p->next = ptr;
    ptr->data = data;
    ptr->next = NULL;
    return head;
}

struct node * insert_at_node(struct node *head,struct node *prenode){
    int data;
    printf("enter element :");
    scanf("%d",&data);
    struct node *ptr = (struct node *) malloc(sizeof(struct node));
    ptr->data=data;
    ptr->next=prenode->next;
    prenode->next = ptr;
    return head;
}

struct node * delete_beginning(struct node *head){
    struct node *ptr = head;
    if (ptr->next == NULL){
        printf("\nCannot delete as SLL is empty\n");
        return head;
    }
    head = head->next;
    printf("%d deleted from SLL\n",ptr->data);
    free(ptr);
    return head;
}

struct node * delete_between(struct node *head,int index){
    struct node *ptr =head;
    if (head->next == NULL){
        printf("\nCannot delete as SLL is empty\n");
        return head;
    }
    int i=0;
    while(i<index-1){
        if (ptr->next ==NULL){
            printf("\nindex out of bounds\n");
            return head;
        }
        ptr=ptr->next;
        i++;
    }
    struct node *q = ptr->next;
    ptr->next = q->next;
    printf("%d deleted from SLL\n",q->data);
    free(q);
    return head;
}

struct node *delete_end(struct node *head){
    if (head->next == NULL){
        printf("\nCannot delete as SLL is empty\n");
        return head;
    }
    struct node *p = head;
    struct node *q = p->next;
    while(q->next!=NULL){
        p=p->next;
        q=q->next;
    }
    p->next =NULL;
    printf("%d deleted from SLL\n",q->data);
    free(q);
    return head;
}

struct node *delete_at_node(struct node *head){
    int data;
    printf("enter element :");
    scanf("%d",&data);
    struct node *p =head;
    struct node *q= p->next;
    while(q->next!=NULL && q->data!=data){
        p=p->next;
        q=q->next;
    }
    p->next=q->next;
    free(q);
    return head;
}

void printall(struct node *ptr){
    if (ptr == NULL){
        printf("SLL is empty\n");
        return;
    }
    else{
        while(ptr!=NULL){
            printf("%d\t",ptr->data);
            ptr = ptr->next;
        }
        printf("\n");
    }
}

int length(struct node *ptr){
    int len=1;
    while( ptr->next!=NULL){
        ptr = ptr->next;
        len++;
    }
    return len;
}

struct node *delete_SLL(struct node *head){
    int len = length(head);
    return head;
}

void main(){
    int done=0,ch,index;
    struct node *head;

    head = (struct node*) malloc(sizeof(struct node));
    head->data = NULL;
    head->next = NULL;


    while(!done){
        printf("\n\n1. Insert node at beginning\n2. Insert node at end\n3. Insert at index\n4. Delete at beginning\n5. Delete between\n6. Delete end\n7. Printall\n8. Print length\n\n");
        scanf("%d",&ch);

        if (ch==2){
            if (head->data==NULL){
                printf("enter element :");
                scanf("%d",&head->data);
            }
            else{
                head=insert_at_end(head);
            }
        }
        else if (ch==1){
            if (head->data==NULL){
                printf("enter element :");
                scanf("%d",&head->data);
            }
            else{
                head=insert_beg(head);
            }
        }
        else if (ch==3){
            printf("enter index:");
            scanf("%d",&index);
            head = insert_at_index(head,index);
        }
        else if (ch==4){
            head = delete_beginning(head);
        }
        else if (ch==5){
            printf("enter index:");
            scanf("%d",&index);
            head = delete_between(head,index);
        }
        else if (ch==6){
            head = delete_end(head);
        }
        else if(ch==7){
            printall(head);
        }
        else if (ch==8){
            printf("\nLength of SLL = %d\n",length(head));
        }
        else{
            break;
        }
    }
    printf("\nFinal Elements are\n");

    printall(head);
    
}
