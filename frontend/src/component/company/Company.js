import {Component} from "react";

import "../chevron/Chevron.css";
import "./Company.css";

class Company extends Component {

    render() {
        let companyClassName = this.getCompanyClassName();
        let companyTextClassName = this.getCompanyTextClassName();
        return (
            <div className="company-container" onClick={this.props.onClick}>
                <div className={companyClassName}>
                    <div className={companyTextClassName}>
                        {this.props.visibleCompany}
                    </div>
                </div>
            </div>
        )
    }

    getCompanyTextClassName() {
        return this.props.chevronUp ?
            "company__text chevron chevron-up" :
            "company__text chevron chevron-down";
    }

    getCompanyClassName() {
        return "company";
    }

}

export default Company;