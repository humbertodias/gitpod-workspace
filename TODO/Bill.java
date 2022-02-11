package TODO;

public class Bill {
    id: string;
    state: "overdue" | "open" | "future" | "closed";
    summary: BillSummary;
    _links: BillLinks;
    line_items?: BillLineItem[];
}
