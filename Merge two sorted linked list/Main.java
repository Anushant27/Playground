#include<stdio.h>
#include<malloc.h>
#include<stdlib.h>
struct Node
{
  int data;
  struct Node *next;
};

void display(struct Node *head)
{
  struct Node *temp=head;
  while(temp!=0)
  {
    printf("%d->",temp->data);
    temp=temp->next;
  }
  printf("NULL\n");
}
struct Node *insertatend(struct Node *head,int data)
{
  struct Node *node=head;
  if(node==NULL)
  {
    node=(struct Node *) malloc(sizeof(struct Node));
    node->data=data;
    node->next=NULL;
    return node;
  }
  while(node->next!=NULL)
  {
    node=node->next;
  }
  
  struct Node *lastnode;
  lastnode=(struct Node*) malloc(sizeof(struct Node));
  lastnode->data=data;
  lastnode->next=NULL;
  
  node->next=lastnode;
  return head;
}

void merge(struct Node **list1head,struct Node *list2head)
{
  struct Node *pointer1=*list1head;
  struct Node *pointer2=list2head;

  if(pointer1==NULL)
  {
    *list1head=list2head;
    return;
  }
  if(pointer2==NULL)
  {
    return;
  }
  
  if(pointer1->data > pointer2->data)
  {
    struct Node *temp;
    temp=pointer2->next;
    pointer1=pointer2;
    pointer1->next=*list1head;
    pointer2=temp;
    
    *list1head=pointer1;
  }
  
  while(pointer1->next !=NULL && pointer2 != NULL)
  {
    if(pointer1->next->data > pointer2->data)
    {
      struct Node *temp1, *temp2;
      temp1=pointer1->next;
      temp2=pointer2->next;
      pointer1->next=pointer2;
      pointer2->next=temp1;
      pointer2=temp2;
      pointer1=pointer1->next;
    }
    else
    {
      pointer1=pointer1->next;
    }
  }
  if(pointer2 !=NULL)
  {
    pointer1->next=pointer2;
  }
}

int main()
{
  int i,list1count,list2count,tmp;
  struct Node *list1head=NULL, *list2head=NULL;
  
  scanf("%d",&list1count);
  for(i=0;i<list1count;i++)
  {
    scanf("%d",&tmp);
    list1head=insertatend(list1head,tmp);
  }
  
  scanf("%d",&list2count);
  for(i=0;i<list2count;i++)
  {
    scanf("%d",&tmp);
    list2head=insertatend(list2head,tmp);
  }
  
  merge(&list1head, list2head);
  
  display(list1head);
}