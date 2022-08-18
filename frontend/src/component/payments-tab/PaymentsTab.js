import {Component} from "react";
import PaymentsTable from "../payments-table/PaymentsTable";

import "./PaymentsTab.css";

export class PaymentsTab extends Component {

    render() {
        return (
            <div className={"payment-container"}>
                {/*<AddPaymentForm/>*/}
                {/*<PaymentsContent/>*/}
                <PaymentsTable/>
            </div>
        );
    }

}