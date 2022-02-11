package TODO;

public class Customer {
    id: string;
    cpf: string;
    name: string;
    printed_name: string;
    preferred_name: string;
    email: string;
    phone: string;
    nationality: string;
    marital_status: string;
    dob: string; // date of birth
    profession: string;
    gender: string;
    address_line1: string;
    address_line2: string;
    address_state: string;
    address_number: string;
    address_postcode: string;
    address_city: string;
    address_country: string;
    address_locality: string;
    address_updated_at: string;
    billing_address_line1: string;
    billing_address_line2: string;
    billing_address_state: string;
    billing_address_city: string;
    billing_address_locality: string;
    billing_address_postcode: string;
    billing_address_country: string;
    billing_address_number: string;
    documents: CustomerDocument[];
    primary_device: CustomerDevice;
    devices: CustomerDevice[];
    channels: string[];
    external_ids: Record<string, string>;
    last_atualizacao_cadastral_at: string;
    reported_income: string;
    mothers_name: string;
    invitations: number;
}
