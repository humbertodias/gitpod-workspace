package TODO;

public class AccountTransaction {
    id: string;
    __typename: string;
    title: string;
    detail: string;
    postDate: string;
    amount?: number;
    destinationAccount?: { name: string };
    originAccount?: { name: string };
}
