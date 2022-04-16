import {Component} from "react";

import "./Company.css";
import "../chevron/Chevron.css";

class Company extends Component {

    render() {
        let companyClassName = "company";
        let companyTextClassName = this.props.chevronUp ?
            "company__text chevron chevron-up" :
            "company__text chevron chevron-down";
        return (
            <div className="company-container">
                <div className={companyClassName}>
                    <div className={companyTextClassName}>
                        {this.props.visibleCompany}
                    </div>
                </div>
            </div>
        )
    }

}

export default Company;