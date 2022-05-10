import {useMemo} from "react";
import {useTable} from "react-table";

import "./PaymentsContent.css";

export function PaymentsContent() {

    const data = useMemo(
        () => [
            {
                category: "Налоги",
                date: "01.01.2022",
                amount: -100,
                comment: "ОМС, первый квартал",
            },
            {
                category: "Новая Категория",
                date: "01.02.2022",
                amount: 99.01,
                comment: "Возврат долгов",
            },
            {
                category: "Еще одна другая категория",
                date: "02.01.2022",
                amount: 101,
                comment: "",
            },
        ],
        []
    )

    const columns = useMemo(
        () => [
            {
                Header: "Категория",
                accessor: "category", // accessor is the "key" in the data
            },
            {
                Header: "Дата",
                accessor: "date",
            },
            {
                Header: "Сумма",
                accessor: "amount",
            },
            {
                Header: "Комментарий",
                accessor: "comment",
            },
        ],
        []
    )

    const {
        getTableProps,
        getTableBodyProps,
        headerGroups,
        rows,
        prepareRow,
    } = useTable({columns, data})

    return (
        <div className="payment-content">
            <table {...getTableProps()} style={{border: "solid 1px grey"}}>
                <thead>
                {headerGroups.map(headerGroup => (
                    <tr {...headerGroup.getHeaderGroupProps()}>
                        {headerGroup.headers.map(column => (
                            <th
                                {...column.getHeaderProps()}
                                style={{
                                    border: "solid 1px grey",
                                    background: "lightgray",
                                    color: "black",
                                    fontWeight: "bold",
                                }}
                            >
                                {column.render("Header")}
                            </th>
                        ))}
                    </tr>
                ))}
                </thead>
                <tbody {...getTableBodyProps()}>
                {rows.map(row => {
                    prepareRow(row)
                    return (
                        <tr {...row.getRowProps()}>
                            {row.cells.map(cell => {
                                return (
                                    <td
                                        {...cell.getCellProps()}
                                        style={{
                                            padding: "10px",
                                            border: "solid 1px gray",
                                            background: "white",
                                        }}
                                    >
                                        {cell.render('Cell')}
                                    </td>
                                )
                            })}
                        </tr>
                    )
                })}
                </tbody>
            </table>
        </div>
    )

}